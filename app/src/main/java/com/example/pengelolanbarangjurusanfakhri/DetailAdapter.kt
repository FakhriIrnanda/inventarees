package com.example.pengelolanbarangjurusanfakhri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter (val dataBarang : List<DataItem?>?) : RecyclerView.Adapter<DetailAdapter.MyViewHolder>() {
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaBarang = view.findViewById<TextView>(R.id.tvNamabarang)
        val tanggal = view.findViewById<TextView>(R.id.tvTanggal)
        val jumlah = view.findViewById<TextView>(R.id.tvJumlah)
        val spesifikasi = view.findViewById<TextView>(R.id.tvSpek)
        val keterangan = view.findViewById<TextView>(R.id.tvKeterangan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_detail_barang, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if (dataBarang != null){
            return dataBarang.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaBarang.text = dataBarang?.get(position)?.namaBarang
        holder.tanggal.text = dataBarang?.get(position)?.tanggal

        val jumlahBarang = dataBarang?.get(position)?.jumlahBarang?.toString()
        holder.jumlah.text = jumlahBarang

        //holder.jumlah.text = dataBarang?.get(position)?.jumlahBarang
        holder.spesifikasi.text = dataBarang?.get(position)?.spesifikasi
        holder.keterangan.text = dataBarang?.get(position)?.keterangan

    }
}