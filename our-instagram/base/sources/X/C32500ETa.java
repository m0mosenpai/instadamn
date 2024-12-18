package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.ETa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32500ETa extends C1P1 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    public C32500ETa(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i, boolean z) {
        this.A00 = i;
        this.A05 = obj2;
        this.A06 = str;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A07 = z;
        this.A01 = obj;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-991414495);
            AbstractC55180Odl.A03((UserSession) this.A05, ShareType.A0H, "likes_sheet", null, this.A06);
            ((C38321qM) this.A04).A4H(EnumC76753cN.A04);
            C55628OnD.A04(((OFL) this.A03).A08, false);
            ((ENZ) this.A02).A03();
            C9GR.A01((Context) this.A01, MSV.A00(206), 2131962508, 0);
            i = -823377475;
        } else {
            A03 = C0f9.A03(-236480805);
            AbstractC35236FgV.A01(((C41645Ibb) this.A01).A00, ((SavedCollection) this.A02).A0G, AbstractC167007dF.A1X(this.A05, C05F.A00));
            i = 529987787;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
    
        if (r4.A0F.equals(r17.A06) == false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.ICf, java.lang.Object] */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32500ETa.onSuccess(java.lang.Object):void");
    }
}
