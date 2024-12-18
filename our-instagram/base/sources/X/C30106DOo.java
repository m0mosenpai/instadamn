package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.DOo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30106DOo extends C0YY implements InterfaceC16660sJ {
    public static final C30106DOo A00 = new C30106DOo();

    public C30106DOo() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C14360o3.A0B(context, 0);
        return LayoutInflater.from(context).inflate(R.layout.opal_profile_picture, (ViewGroup) null, false);
    }
}
