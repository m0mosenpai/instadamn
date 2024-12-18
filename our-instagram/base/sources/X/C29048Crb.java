package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Crb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29048Crb implements C2YT {
    public static final C29048Crb A00 = new Object();

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        Context context = c2yr.A00.A04;
        View inflate = LayoutInflater.from(context).inflate(R.layout.offensive_content_warning, (ViewGroup) null);
        AbstractC25231BEo.A0z(inflate, j);
        return new C2YU(AbstractC78673fZ.A00(C78613fT.A01(j), Math.min(inflate.getMeasuredHeight() + AbstractC167017dG.A04(context), C78613fT.A00(j))), null);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
