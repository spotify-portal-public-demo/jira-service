package com.spotify.demo.album;

import org.springframework.stereotype.Service;
import com.spotify.demo.album.proto.AddAlbumsRequest;
import com.spotify.demo.album.proto.AddAlbumsResponse;
import com.spotify.demo.album.proto.AlbumServiceGrpc.AlbumServiceImplBase;
import com.spotify.demo.album.proto.GetAlbumsRequest;
import com.spotify.demo.album.proto.GetAlbumsResponse;
import com.spotify.demo.album.proto.RemoveAlbumsRequest;
import com.spotify.demo.album.proto.RemoveAlbumsResponse;
import io.grpc.stub.StreamObserver;

@Service
class AlbumService extends AlbumServiceImplBase {

  @Override
  public void getAlbums(GetAlbumsRequest req, StreamObserver<GetAlbumsResponse> responseObserver) {
    var reply = GetAlbumsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void addAlbums(AddAlbumsRequest req, StreamObserver<AddAlbumsResponse> responseObserver) {
    var reply = AddAlbumsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void removeAlbums(RemoveAlbumsRequest req,
      StreamObserver<RemoveAlbumsResponse> responseObserver) {
    var reply = RemoveAlbumsResponse.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

}
