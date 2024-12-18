package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9nS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219809nS extends AbstractC219819nT implements C89G {
    public int A00;
    public Drawable A01;
    public BE6 A02;
    public AbstractC172157lk A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final C89F A07;
    public final TargetViewSizeProvider A08;
    public final BC3 A09;
    public final C1816283r A0A;
    public final EnumC171727l2 A0B;
    public final String A0C;
    public final String A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final C89F A0G;

    public final String A04() {
        int ordinal = this.A0A.A02.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                AbstractC172157lk abstractC172157lk = this.A03;
                if (abstractC172157lk instanceof C172147lj) {
                    return "remix_sticker_side_by_side";
                }
                if (!(abstractC172157lk instanceof C171737l3)) {
                    return "";
                }
                return "remix_sticker_picture_in_picture";
            }
            throw B4Z.A00();
        }
        AbstractC172157lk abstractC172157lk2 = this.A03;
        if (!(abstractC172157lk2 instanceof C172147lj)) {
            if (!(abstractC172157lk2 instanceof C171737l3)) {
                return "";
            }
            throw AbstractC166987dD.A14(C25043B6q.A00.toString());
        }
        throw AbstractC166987dD.A14(C25042B6p.A00.toString());
    }

    @Override // X.C89G
    public final void DM8(int i) {
        this.A00 = i;
        C89F c89f = this.A07;
        if (c89f.A0B()) {
            c89f.A05 = i;
        }
    }

    @Override // X.C89G
    public final void DWV(float f) {
        C89F c89f = this.A07;
        if (c89f.A0B()) {
            c89f.DWV(f);
        }
    }

    @Override // X.C89G
    public final void DWW(float f) {
        C89F c89f = this.A07;
        if (c89f.A0B()) {
            c89f.DWW(f);
        }
    }

    @Override // X.C89G
    public final void DhY(float f) {
        C89F c89f = this.A07;
        if (c89f.A0B()) {
            c89f.DhY(f);
        }
    }

    @Override // X.C89G
    public final void DiN(float f) {
        if (this.A02 != null) {
            C89F c89f = this.A07;
            if (c89f.A0B()) {
                c89f.DiN(f);
            }
            if (!this.A04) {
                AbstractC172157lk abstractC172157lk = this.A03;
                if (!(abstractC172157lk instanceof C171737l3)) {
                    if ((abstractC172157lk instanceof C197448oF) && !this.A05) {
                        return;
                    }
                } else {
                    return;
                }
            }
            BE6 be6 = this.A02;
            if (be6 != null) {
                be6.Dek(this.A03, f);
            } else {
                C14360o3.A0F("thumbnailDrawable");
                throw C00O.createAndThrow();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C219809nS(Context context, UserSession userSession, C55U c55u, C89F c89f, TargetViewSizeProvider targetViewSizeProvider, BC3 bc3, C1816283r c1816283r, String str, String str2) {
        super(context, c55u, c1816283r.A03);
        InterfaceC09390do interfaceC09390do;
        AbstractC167027dH.A13(context, userSession, c55u);
        AbstractC167007dF.A1I(c89f, 6, targetViewSizeProvider);
        this.A06 = userSession;
        this.A07 = c89f;
        this.A09 = bc3;
        this.A0E = AbstractC09440dt.A01(new B5y(this, 30));
        this.A0A = c1816283r;
        this.A0C = str;
        this.A0G = c89f;
        this.A08 = targetViewSizeProvider;
        this.A0D = str2;
        this.A0B = EnumC171727l2.A04;
        this.A0F = AbstractC09440dt.A01(new B5y(this, 29));
        if (this instanceof C219809nS) {
            interfaceC09390do = this.A0F;
        } else {
            interfaceC09390do = ((C219799nR) this).A03;
        }
        this.A03 = ((AbstractC172157lk[]) interfaceC09390do.getValue())[0];
    }
}
