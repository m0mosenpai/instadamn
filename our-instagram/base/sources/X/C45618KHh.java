package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView;

/* renamed from: X.KHh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45618KHh extends AbstractC66412zI {
    public final L6V A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZS lzs = (LZS) interfaceC66482zP;
        C44644Jpo c44644Jpo = (C44644Jpo) c3oo;
        AbstractC167017dG.A1N(lzs, c44644Jpo);
        C14360o3.A0B(this.A00, 2);
        PendingThreadsMessageSettingsView pendingThreadsMessageSettingsView = c44644Jpo.A00;
        pendingThreadsMessageSettingsView.setTitleText(lzs.A01);
        pendingThreadsMessageSettingsView.setLinkToSettingsVisibility(8);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZS.class;
    }

    public C45618KHh(L6V l6v) {
        this.A00 = l6v;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.pending_threads_header_row, viewGroup, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header.PendingThreadsMessageSettingsView");
        return new C44644Jpo((PendingThreadsMessageSettingsView) inflate);
    }
}
