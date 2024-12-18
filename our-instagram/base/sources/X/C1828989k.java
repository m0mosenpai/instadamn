package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.File;

/* renamed from: X.89k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1828989k extends AbstractC52922bZ {
    public C1816283r A00;
    public File A01;
    public C05A A02;
    public final C2GT A03;
    public final C2GS A04;
    public final C2GS A05;
    public final C2GS A06 = new C2GT(EnumC1829089l.A05);
    public final C05A A07;

    public final void A02(Context context, UserSession userSession, File file) {
        C14360o3.A0B(file, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A07.Egh(false);
        Medium A03 = C8IU.A03(file, 1, 0);
        C49602Pt A00 = C2Ps.A00(context, userSession);
        String str = ((C22F) AnonymousClass229.A01(userSession)).A04.A0L;
        if (str == null) {
            str = "";
        }
        AbstractC23025ADh.A01(context, A03, userSession, new C2AH() { // from class: X.9gz
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                C1828989k.this.A06.A0B(EnumC1829089l.A03);
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C195868lW c195868lW = (C195868lW) obj;
                C14360o3.A0B(c195868lW, 0);
                C1828989k c1828989k = C1828989k.this;
                c1828989k.A01 = AbstractC166987dD.A11(c195868lW.A0k);
                c1828989k.A06.A0B(EnumC1829089l.A04);
                AbstractC166997dE.A1Y(c1828989k.A07, true);
            }
        }, C75I.A00(context, userSession), A00, str, true);
    }

    public final C9JS A00() {
        String A2a;
        C1816283r c1816283r = this.A00;
        if (c1816283r != null) {
            AbstractC172157lk abstractC172157lk = (AbstractC172157lk) this.A05.A02();
            C202278x7 c202278x7 = (C202278x7) this.A04.A02();
            EnumC189548aZ enumC189548aZ = c1816283r.A00;
            if (!enumC189548aZ.A01) {
                return null;
            }
            C38321qM c38321qM = c1816283r.A04;
            String id = c38321qM.getId();
            if (id != null) {
                long A1C = c38321qM.A1C();
                if (c38321qM.A5x()) {
                    ExtendedImageUrl A1o = c38321qM.A1o(c38321qM.A0z());
                    if (A1o == null) {
                        return null;
                    }
                    A2a = A1o.A0A;
                } else {
                    A2a = c38321qM.A2a();
                }
                if (A2a == null) {
                    return null;
                }
                return new C9JS(c1816283r.A02, abstractC172157lk, enumC189548aZ, c202278x7, Boolean.valueOf(C14360o3.A0K(c38321qM.A0C.Acc(), true)), id, A2a, c1816283r.A05.getUsername(), C16930sl.A00, A1C);
            }
            throw new IllegalStateException("Required value was null.");
        }
        return null;
    }

    public final EnumC189548aZ A01() {
        C1816283r c1816283r = this.A00;
        if (c1816283r != null) {
            return c1816283r.A00;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2GT, X.2GS] */
    public C1828989k() {
        C2GS c2gs = new C2GS();
        this.A05 = c2gs;
        this.A04 = new C2GS();
        this.A02 = new C008002u(false);
        this.A03 = c2gs;
        this.A07 = new C008002u(false);
    }

    public final boolean A03() {
        if (A01() != EnumC189548aZ.A07) {
            return false;
        }
        return true;
    }
}
