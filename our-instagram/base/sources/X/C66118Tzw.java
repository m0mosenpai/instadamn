package X;

import android.graphics.Rect;
import androidx.fragment.app.Fragment;
import com.instagram.autoplay.models.AutoplayOnScreenItemWithMetadata;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Tzw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66118Tzw extends C66117Tzv implements InterfaceC71975XDi {
    public final Map A00;
    public final C65868TvV A01;
    public final C66110Tzo A02;
    public final MZ4 A03;
    public final Map A04;
    public final Map A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66118Tzw(Fragment fragment, C65868TvV c65868TvV, C66110Tzo c66110Tzo, UserSession userSession, C66102Tzd c66102Tzd, XG0 xg0, MZ4 mz4, C38082GpB c38082GpB) {
        super(fragment, userSession, c66102Tzd, xg0, mz4, c38082GpB);
        C14360o3.A0B(c66110Tzo, 2);
        this.A01 = c65868TvV;
        this.A02 = c66110Tzo;
        this.A03 = mz4;
        this.A00 = new LinkedHashMap();
        this.A04 = new LinkedHashMap();
        this.A05 = new LinkedHashMap();
    }

    @Override // X.C66117Tzv, X.JI3
    public final void E0I(AbstractC127945qN abstractC127945qN) {
        C14360o3.A0B(abstractC127945qN, 0);
        C38321qM A02 = A02(abstractC127945qN);
        if (A02 != null) {
            C14360o3.A0B(AnonymousClass001.A0R("onVideoViewExitingScreen: ", A02.getId()), 0);
            super.E0I(abstractC127945qN);
            this.A01.A01(A02, false);
            this.A04.remove(abstractC127945qN);
        }
    }

    @Override // X.InterfaceC71975XDi
    public final void En6(C38321qM c38321qM, int i) {
        C14360o3.A0B(AnonymousClass001.A0R("startBufferingOrPlaying: ", c38321qM.getId()), 0);
        this.A00.put(c38321qM, new C66122U0e(i));
    }

    public static final void A01(Rect rect, C66118Tzw c66118Tzw, AbstractC127945qN abstractC127945qN, float f, int i) {
        Rect rect2;
        Float f2;
        rect.top = i;
        Map map = c66118Tzw.A04;
        String str = null;
        if (map.containsKey(abstractC127945qN)) {
            U0O u0o = (U0O) map.get(abstractC127945qN);
            if (u0o != null) {
                rect2 = u0o.A01;
            } else {
                rect2 = null;
            }
            if (C14360o3.A0K(rect2, rect)) {
                U0O u0o2 = (U0O) map.get(abstractC127945qN);
                if (u0o2 != null) {
                    f2 = Float.valueOf(u0o2.A00);
                } else {
                    f2 = null;
                }
                if (C14360o3.A0I(f2, f)) {
                    return;
                }
            }
        }
        C38321qM A02 = c66118Tzw.A02(abstractC127945qN);
        if (A02 == null) {
            return;
        }
        map.put(abstractC127945qN, new U0O(new Rect(rect), abstractC127945qN, A02, f));
        if (f > 0.0f) {
            c66118Tzw.A01.A01(A02, true);
        }
        C38321qM A022 = c66118Tzw.A02(abstractC127945qN);
        if (A022 != null) {
            str = A022.getId();
        }
        C14360o3.A0B(AnonymousClass001.A0R("onVideoViewUpdatingOnScreen: ", str), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C38321qM A02(X.AbstractC127945qN r2) {
        /*
            r1 = this;
            X.Tzd r0 = r1.A02
            X.U0N r0 = r0.A02(r2)
            if (r0 == 0) goto L19
            X.1qM r0 = r0.A01
        La:
            if (r0 != 0) goto L18
        Lc:
            java.util.Map r0 = r1.A04
            java.lang.Object r0 = r0.get(r2)
            X.U0O r0 = (X.U0O) r0
            if (r0 == 0) goto L20
            X.1qM r0 = r0.A02
        L18:
            return r0
        L19:
            X.5uv r0 = r2.A03
            if (r0 == 0) goto Lc
            X.1qM r0 = r0.A0A
            goto La
        L20:
            java.util.Map r0 = r1.A05
            java.lang.Object r0 = r0.get(r2)
            X.1qM r0 = (X.C38321qM) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66118Tzw.A02(X.5qN):X.1qM");
    }

    @Override // X.InterfaceC71975XDi
    public final boolean BJq(C38321qM c38321qM) {
        MZA mza;
        MZ4 mz4 = this.A03;
        Map map = mz4.A03;
        if (!map.isEmpty() && map.containsKey(c38321qM) && mz4.Cdd(c38321qM) && (mza = (MZA) map.get(c38321qM)) != null && mza.A0H()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71975XDi
    public final void Eoc(C38321qM c38321qM) {
        this.A00.remove(c38321qM);
    }

    @Override // X.InterfaceC71975XDi
    public final void FBY(AutoplayOnScreenItemWithMetadata autoplayOnScreenItemWithMetadata) {
        Object obj;
        Iterator it = this.A04.values().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((U0O) obj).A02.getId(), autoplayOnScreenItemWithMetadata.media.getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        U0O u0o = (U0O) obj;
        if (u0o != null) {
            Rect rect = u0o.A01;
            autoplayOnScreenItemWithMetadata.x = rect.left;
            autoplayOnScreenItemWithMetadata.y = rect.top;
            autoplayOnScreenItemWithMetadata.width = rect.width();
            autoplayOnScreenItemWithMetadata.height = rect.height();
            autoplayOnScreenItemWithMetadata.percentageVisible = u0o.A00;
        }
    }
}
