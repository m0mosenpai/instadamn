package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Gts, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38356Gts extends C2UU {
    public C42322Iok A00;
    public String A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38484Gw5(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.media_list_section_item, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f7  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r20, int r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38356Gts.onBindViewHolder(X.3OO, int):void");
    }

    public C38356Gts(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int size;
        int A03 = C0f9.A03(-61175192);
        C42322Iok c42322Iok = this.A00;
        if (c42322Iok == null) {
            size = 0;
        } else {
            size = ((List) c42322Iok.A00.A01).size();
        }
        C0f9.A0A(292832301, A03);
        return size;
    }
}
