package com.sounuo.jiwai.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sounuo.jiwai.R;

/**
 * 展示收藏的消息？
 * 
 * @author gq
 *
 */
public class MeCollectionFragment extends Fragment {

	private boolean Test = true;
	private ImageView ImageviewNothing;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View inflate = inflater.inflate(R.layout.me_fragment_collection, null);

		initViews(inflate);

		getPicFromDb();

		return inflate;
	}

	private void getPicFromDb() {
		if (Test) {
			// 木有照片
			ImageviewNothing.setVisibility(View.VISIBLE);
		}

	}

	private void initViews(View inflate) {
		ImageviewNothing = (ImageView) inflate.findViewById(R.id.me_collection_nothing);
	}

	public void initTestDate() {
		
//        "id": "10792764",
//        "share": "0",
//        "title": "揭秘日入50万美金的Android黑客组织、阿里巴巴首届在线技术峰会",
//        "username": "gqlovelj",
//        "description": "",
//        "domain": "geek.csdn.net",
//        "dateline": "1467967013",
//        "url": "http://geek.csdn.net/news/detail/87312"
		
//		分页加载，时间线

	}

}
