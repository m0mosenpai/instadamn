package X;

import android.content.Context;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160687Ic {
    public final Context A00;
    public final InterfaceC74953Yl A01;
    public final C55952hg A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C98K A05;
    public final C7ZX A06;
    public final AnonymousClass988 A07;

    public C160687Ic(Context context, C55952hg c55952hg, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C98K c98k, C7ZX c7zx, AnonymousClass988 anonymousClass988, C7IM c7im) {
        this.A00 = context;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A07 = anonymousClass988;
        this.A06 = c7zx;
        this.A02 = c55952hg;
        this.A05 = c98k;
        C74883Yd A00 = AbstractC74873Yc.A00();
        InterfaceC09390do interfaceC09390do = AbstractC74903Yf.A01;
        this.A01 = new ParcelableSnapshotMutableState(A00, c7im);
    }
}
