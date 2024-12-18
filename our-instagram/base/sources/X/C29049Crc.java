package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Crc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29049Crc implements C2YT {
    public static final C29049Crc A00 = new Object();

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        return AbstractC25234BEr.A0R(LayoutInflater.from(c2yr.A00.A04).inflate(R.layout.comment_actions_multi_select_menu_litho, (ViewGroup) null), j);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
