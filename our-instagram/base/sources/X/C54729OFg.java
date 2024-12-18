package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.OFg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54729OFg {
    public final Activity A00;
    public final Context A01;
    public final Fragment A02;
    public final C82G A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final ImageUrl A06;
    public final C195918ld A07;
    public final InterfaceC57990Pna A08;
    public final C55011OVw A09;
    public final C54723OFa A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public C54729OFg(Activity activity, Context context, Fragment fragment, C82G c82g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, C195918ld c195918ld, InterfaceC57990Pna interfaceC57990Pna, C55011OVw c55011OVw, C54723OFa c54723OFa, String str, String str2, List list) {
        this.A00 = activity;
        this.A05 = userSession;
        this.A03 = c82g;
        this.A08 = interfaceC57990Pna;
        this.A04 = interfaceC11380iw;
        this.A07 = c195918ld;
        this.A0B = str;
        this.A0C = str2;
        this.A01 = context;
        this.A02 = fragment;
        this.A09 = c55011OVw;
        this.A0A = c54723OFa;
        this.A0D = list;
        this.A06 = imageUrl;
    }
}
