package X;

import android.view.ViewGroup;
import com.facebook.R;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Mih, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51138Mih extends C2UU {
    public int A00;
    public List A01 = Collections.emptyList();
    public final O4F A02 = new O4F(this);
    public final ReelMoreOptionsFragment A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C51323Mlk c51323Mlk = (C51323Mlk) c3oo;
        O7A o7a = (O7A) this.A01.get(i);
        boolean A1P = AbstractC167007dF.A1P(i, this.A00);
        c51323Mlk.A00 = o7a;
        c51323Mlk.A02.A02(o7a.A00.A00, null);
        c51323Mlk.A01.setSelected(A1P);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51323Mlk(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.ar_effect_option_layout), this.A02);
    }

    public C51138Mih(ReelMoreOptionsFragment reelMoreOptionsFragment, String str) {
        this.A00 = 0;
        this.A03 = reelMoreOptionsFragment;
        if (str == null) {
            return;
        }
        for (int i = 0; i < this.A01.size(); i++) {
            if (((O7A) this.A01.get(i)).A01.equals(str)) {
                this.A00 = i;
                return;
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1160683475);
        int size = this.A01.size();
        C0f9.A0A(368397771, A03);
        return size;
    }
}
