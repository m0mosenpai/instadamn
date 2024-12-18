package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8lR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195838lR {
    public final Context A00;
    public final ViewGroup A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final HashMap A06;
    public final ViewGroup A07;

    public C195838lR(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 1);
        this.A07 = viewGroup;
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        this.A00 = context;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.A01 = viewGroup2;
        viewGroup.addView(viewGroup2);
        this.A02 = (ImageView) viewGroup2.findViewById(R.id.imageview);
        this.A05 = (TextView) viewGroup2.findViewById(R.id.title);
        this.A04 = (TextView) viewGroup2.findViewById(R.id.message);
        this.A03 = (TextView) viewGroup2.findViewById(R.id.link);
        this.A06 = new HashMap();
    }

    public final void A06(Map map) {
        C14360o3.A0B(map, 0);
        HashMap hashMap = this.A06;
        hashMap.clear();
        hashMap.putAll(map);
    }

    public final void A00() {
        this.A07.removeView(this.A01);
    }

    public final void A01() {
        this.A01.setOnTouchListener(new View.OnTouchListener() { // from class: X.9RI
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AbstractC167017dG.A1a(view, motionEvent);
            }
        });
    }

    public final void A02(int i) {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setText(i);
        }
    }

    public final void A03(View.OnClickListener onClickListener) {
        TextView textView = this.A03;
        if (textView != null) {
            C0fQ.A00(onClickListener, textView);
        }
    }

    public final void A04(String str) {
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void A05(String str) {
        TextView textView = this.A05;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
