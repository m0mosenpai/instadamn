package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;

/* renamed from: X.4FE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FE extends AbstractC66412zI {
    public final C07T A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C57112jm A03;
    public final NotesRepository A04;
    public final C4F8 A05;
    public final C4FF A06;
    public final InterfaceC16820sZ A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C4FE(C07T c07t, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C4F8 c4f8, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c07t, 4);
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A08 = z;
        this.A00 = c07t;
        this.A05 = c4f8;
        this.A03 = c57112jm;
        this.A09 = z2;
        this.A07 = interfaceC16820sZ;
        this.A04 = C4A5.A00(userSession);
        this.A06 = new C4FF(userSession);
        this.A0A = C18U.A01(C06090Tz.A05, userSession, 36604880986051722L) > 0;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Context context = layoutInflater.getContext();
        C14360o3.A07(context);
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.featured_user_story_ring_size);
        Context context2 = layoutInflater.getContext();
        C14360o3.A07(context2);
        Resources resources2 = context2.getResources();
        C14360o3.A07(resources2);
        return new C106144qU(C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.avatar_size_ridiculously_xxxlarge)), viewGroup, R.layout.item_pog, 0, false, this.A0A), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x09ac, code lost:
    
        if (X.AbstractC13670mt.A00(r17) > 3) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0804, code lost:
    
        if (X.AbstractC13670mt.A00(r11) > 3) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016b, code lost:
    
        if (X.C4AC.A08(r4.A02) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x09ed, code lost:
    
        if (r14 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x00ef, code lost:
    
        if (r8 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x05fc, code lost:
    
        if (X.C106144qU.A06(r2, r1) == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0608, code lost:
    
        if (X.C4AC.A08(r4.A02) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0640, code lost:
    
        if (X.C4AC.A02(r7) == false) goto L255;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0a60  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:432:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x060f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x064a A[ADDED_TO_REGION] */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r38, X.C3OO r39) {
        /*
            Method dump skipped, instructions count: 3174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4FE.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C4F5.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void unbind(C3OO c3oo) {
        C106144qU c106144qU = (C106144qU) c3oo;
        C14360o3.A0B(c106144qU, 0);
        c106144qU.A0A.A03.A04(c106144qU.A03);
    }

    public C4FE() {
    }
}
