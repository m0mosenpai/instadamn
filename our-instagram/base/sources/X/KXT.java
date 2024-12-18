package X;

import android.view.View;
import com.instagram.igtv.widget.ExpandableTextView;

/* loaded from: classes8.dex */
public final class KXT extends AbstractC85543rj {
    public final int A00 = 0;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KXT(C34676FPl c34676FPl, int i) {
        super("", i, false);
        this.A01 = c34676FPl;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                C43966JcF c43966JcF = ((C31612Due) this.A01).A00;
                A0y = AbstractC25228BEl.A0y(c43966JcF.A00, c43966JcF.A01, C2Fb.A1W, "https://www.facebook.com/help/instagram/475931443650619");
                A0y.A0S = "direct_inbox_general_folder_banner";
                break;
            case 1:
                C34676FPl c34676FPl = (C34676FPl) this.A01;
                A0y = AbstractC25228BEl.A0y(c34676FPl.A00, c34676FPl.A01, C2Fb.A1W, "https://www.facebook.com/legal/page_contact_terms");
                break;
            default:
                MNZ mnz = ((ExpandableTextView) this.A01).A01;
                if (mnz != null) {
                    C44753Jra c44753Jra = ((C49509LuM) mnz).A00;
                    int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    C44572Jnx c44572Jnx = c44753Jra.A07.A01;
                    if (c44572Jnx == null) {
                        C14360o3.A0F("seriesAdapter");
                        throw C00O.createAndThrow();
                    }
                    c44572Jnx.A03 = true;
                    c44572Jnx.notifyItemChanged(0);
                    return;
                }
                return;
        }
        A0y.A0A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KXT(ExpandableTextView expandableTextView, int i) {
        super(false, i);
        this.A01 = expandableTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KXT(C31612Due c31612Due, int i) {
        super("", i, false);
        this.A01 = c31612Due;
    }
}
