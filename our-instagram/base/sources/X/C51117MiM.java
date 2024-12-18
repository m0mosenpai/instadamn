package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MiM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51117MiM extends AbstractC155316yK {
    public static final C51090Mhp A04 = new C51090Mhp(4);
    public RecyclerView A00;
    public OHM A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = recyclerView;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.layout_cowatch_playback_carousel_page, viewGroup, false);
        Ok3.A00(inflate, 15, this);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C14360o3.A0A(inflate);
        return new C51265Mko(inflate, this.A02, this.A03);
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        this.A00 = null;
    }

    public C51117MiM(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        super(A04);
        this.A02 = interfaceC11380iw;
        this.A03 = userSession;
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51265Mko c51265Mko = (C51265Mko) c3oo;
        C14360o3.A0B(c51265Mko, 0);
        C51906Mwo c51906Mwo = (C51906Mwo) getItem(i);
        if (c51906Mwo != null) {
            c51265Mko.A00.ADV(c51906Mwo);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        C51265Mko c51265Mko = (C51265Mko) c3oo;
        C14360o3.A0B(c51265Mko, 0);
        c51265Mko.A00.A00();
    }
}
