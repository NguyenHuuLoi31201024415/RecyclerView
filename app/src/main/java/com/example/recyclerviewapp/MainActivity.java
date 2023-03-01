package com.example.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcVData;
    private PaperAdapter paperAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcVData = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcVData.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        rcVData.addItemDecoration(itemDecoration);


        paperAdapter = new PaperAdapter(this,getLisPaper());
        rcVData.setAdapter(paperAdapter);
    }

    private List<Paper> getLisPaper() {
        List<Paper> list = new ArrayList<>();





        list.add(new Paper(R.drawable.j,"Volvo V60","Sẵn sàng phiêu lưu – Đam mê thỏa sức. Tận hưởng nét tươi mới của chiếc estate độc đáo đến từ Thụy Điển."));
        list.add(new Paper(R.drawable.k,"Volvo V60 Cross Country","Cho dù bạn phiêu lưu mạo hiểm đến bất kỳ đâu. Hãy tận hưởng không gian nội thất đậm chất riêng mà bạn chọn để thể hiện phong cách bản thân."));
        list.add(new Paper(R.drawable.h,"Volvo S90 Recharge","Vượt mọi kỳ vọng. Nắm bắt công nghệ mới và kiểm soát hành trình. Khám phá mẫu xe sedan sang trọng của chúng tôi.."));
        list.add(new Paper(R.drawable.i,"Volvo S90 Recharge Plug-in Hybrid","Thưởng thức bằng mọi giác quan. Các chi tiết thiết kế nội thất sang trọng và tiện nghi cao cấp nâng niu cảm xúc của bạn trên mọi chặng đường."));
        list.add(new Paper(R.drawable.f,"Volvo XC40 Recharge","Cho mọi phong cách. Đa dụng. Mới mẻ hơn bao giờ hết. Khám phá mẫu xe SUV độc - đỉnh của chúng tôi – thích hợp với mọi sắc màu của không gian bạn đến."));
        list.add(new Paper(R.drawable.g,"Volvo XC40 Recharge Plug-in Hybrid","Khám phá nét hài hòa trong nội thất. Thiết kế hiện đại và vật liệu nội thất được chắt lọc là đặc trưng trong từng chi tiết của xe XC40."));
        list.add(new Paper(R.drawable.d,"Volvo XC60 Recharge","Chú trọng đến từng chi tiết. Về mặt cảm xúc và cảm quan, phát kiến nội thất này đã chạm tới cả trái tim và tâm trí."));
        list.add(new Paper(R.drawable.e,"Volvo XC60 Recharge Plug-in Hybrid","XC60 với trang bị tuyệt đỉnh. Dẫn đầu xu hướng trong từng chi tiết thiết kế. Khám phá mẫu xe SUV cỡ vừa, plug-in hybrid mạnh mẽ nhất của chúng tôi."));
        list.add(new Paper(R.drawable.b,"Volvo XC90 Recharge","Độc đáo, chuẩn mực mới. Chú trọng đến từng chi tiết và sự tiện nghi, xe XC90 Recharge chắc chắn sẽ giúp bạn thư thái trên từng dặm đường."));
        list.add(new Paper(R.drawable.c,"Volvo XC90 Recharge Plug-in Hybrid","Sang trọng. Tiện nghi. Thời thượng. Riêng biệt. Tận hưởng sự thoải mái trong chiếc SUV sang trọng bậc nhất đến từ Thụy Điển."));

        return list;

    }
}