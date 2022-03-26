@extends('layouts.default')

@section('content')
    <section>
        <div class="container">
            <h1>Edit Mahasiswa</h1>
            <div class="row">
                <div class="col-lg-8">
                    <form action="{{ url('/update/'. $data->id) }}" method="POST" enctype="multipart/form-data">
                        @csrf
                        <div class="form-group">
                            <label for="nama">Nama Mahasiswa</label>
                            <input type="text" name="nama" class="form-control" placeholder="Ramdani"
                                value="{{$data->nama}}">
                        </div>
                        <div class="form-group">
                            <label for="nama">NIM</label>
                            <input type="number" name="nim" class="form-control" placeholder="12345"
                                value="{{$data->nim}}">
                        </div>
                        <div class="form-group">
                            <label for="nama">Alamat</label>
                            <textarea  class="form-control" name="alamat" 
                                placeholder="Kota Bekasi">{{ $data->alamat }}</textarea>
                        </div>
                        <div class="form-group mt-2">
                            <button type="submit" class="btn btn-primary">Edit Mahasiswa</button>
                        </div>
                        <div class="form-group mt-2">
                            <a href="{{ url('/') }}">
                                << Kembali ke halaman utama</a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
@endsection