package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import java.util.List;

/* renamed from: X.PGj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56741PGj implements InterfaceC58077Pp2 {
    public InterfaceC58158PqN A00;
    public InterfaceC57995Pnf A01;
    public final C56736PGe A02 = new C56736PGe(this, 3);
    public final InterfaceC09390do A03;

    public C56741PGj(Context context, AbstractC018607g abstractC018607g, UserSession userSession) {
        this.A03 = AbstractC09440dt.A01(new C29901DGp(26, context, userSession, this, abstractC018607g));
    }

    public static final void A00(C56741PGj c56741PGj, boolean z) {
        InterfaceC58158PqN interfaceC58158PqN = c56741PGj.A00;
        if (interfaceC58158PqN != null) {
            int i = 0;
            interfaceC58158PqN.AnS().setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
            InterfaceC58158PqN interfaceC58158PqN2 = c56741PGj.A00;
            if (interfaceC58158PqN2 != null) {
                View BHY = interfaceC58158PqN2.BHY();
                if (z) {
                    i = 8;
                }
                BHY.setVisibility(i);
                InterfaceC58158PqN interfaceC58158PqN3 = c56741PGj.A00;
                if (interfaceC58158PqN3 != null) {
                    View Aqk = interfaceC58158PqN3.Aqk();
                    float f = 0.3f;
                    if (z) {
                        f = 1.0f;
                    }
                    Aqk.setAlpha(f);
                    return;
                }
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58077Pp2
    public final void ADZ(Integer num, Integer num2, List list) {
        int intValue;
        Context context;
        int i;
        String quantityString;
        int intValue2;
        InterfaceC58158PqN interfaceC58158PqN = this.A00;
        if (interfaceC58158PqN != null) {
            Ok3.A00(interfaceC58158PqN.Aqk(), 52, this);
            InterfaceC58158PqN interfaceC58158PqN2 = this.A00;
            if (interfaceC58158PqN2 != null) {
                TextView Brf = interfaceC58158PqN2.Brf();
                if (num != null && (intValue2 = num.intValue()) > 0) {
                    Brf.setVisibility(0);
                    quantityString = AbstractC31175DnJ.A0W(Brf.getResources(), num, R.plurals.num_collections_formatted, intValue2);
                } else if (list != null && !list.isEmpty()) {
                    Brf.setVisibility(0);
                    if (list.size() == 1 && ((C38682GzN) list.get(0)).A05 != null) {
                        quantityString = ((C38682GzN) list.get(0)).A05;
                    } else {
                        quantityString = Brf.getResources().getQuantityString(R.plurals.num_products_formatted, list.size(), AbstractC25228BEl.A1Y(list.size()));
                    }
                } else {
                    if (num2 != null && (intValue = num2.intValue()) > 0) {
                        Brf.setVisibility(0);
                        Brf.setText(Brf.getResources().getQuantityString(R.plurals.product_tagging_suggested_products, intValue));
                        context = Brf.getContext();
                        i = R.attr.igds_color_primary_button;
                        AbstractC31177DnL.A0q(context, Brf, i);
                        return;
                    }
                    Brf.setVisibility(8);
                    return;
                }
                Brf.setText(quantityString);
                context = Brf.getContext();
                i = R.attr.igds_color_secondary_text;
                AbstractC31177DnL.A0q(context, Brf, i);
                return;
            }
        }
        C14360o3.A0F("viewHolder");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58077Pp2
    public final void EfM(BrandedContentTag brandedContentTag) {
        String str;
        InterfaceC09390do interfaceC09390do = this.A03;
        OXN oxn = (OXN) interfaceC09390do.getValue();
        if (brandedContentTag != null) {
            str = brandedContentTag.A01;
        } else {
            str = null;
        }
        oxn.A04(str);
        A00(this, !((OXN) interfaceC09390do.getValue()).A05());
        ((OXN) interfaceC09390do.getValue()).A02();
    }
}
