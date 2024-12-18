package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.7eX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167777eX implements InterfaceC51522Ya {
    public static final C167777eX A00 = new C167777eX();

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.emoji_row_item_contents, (ViewGroup) frameLayout, true);
        return frameLayout;
    }
}
