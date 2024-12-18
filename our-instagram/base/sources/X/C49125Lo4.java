package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Lo4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49125Lo4 implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C162907Rb A02;
    public final C49038LmQ A03;

    @Override // X.C7QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void F91(C49169Lom c49169Lom) {
        C7IN c7in;
        this.A02.A01(c49169Lom);
        C49038LmQ c49038LmQ = this.A03;
        if (c49038LmQ != null) {
            if (!C18U.A06(C06090Tz.A05, c49038LmQ.A00, 2342159118070452219L) && (c7in = (C7IN) c49038LmQ.A04.get(c49169Lom)) != null) {
                c7in.A03("scroll");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0148, code lost:
    
        if (r14 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0045, code lost:
    
        if (r0 == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0246  */
    @Override // X.C7QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADy(X.C49169Lom r26, X.C163157Sa r27) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49125Lo4.ADy(X.Lom, X.7Sa):void");
    }

    public C49125Lo4(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C49038LmQ c49038LmQ, List list) {
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A03 = c49038LmQ;
        this.A02 = new C162907Rb(list);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C49169Lom c49169Lom = new C49169Lom(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.direct_media_share_message));
        this.A02.A00(c49169Lom);
        return c49169Lom;
    }
}
