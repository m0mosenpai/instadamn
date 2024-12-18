package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.KHp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45626KHp extends AbstractC66412zI {
    public C47243KuG A00 = null;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        return new C44651Jpv(new IgdsBanner(AbstractC166997dE.A0L(viewGroup), null, 0));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C48319LZs c48319LZs = (C48319LZs) interfaceC66482zP;
        C44651Jpv c44651Jpv = (C44651Jpv) c3oo;
        AbstractC167017dG.A1N(c48319LZs, c44651Jpv);
        IgdsBanner igdsBanner = c44651Jpv.A00;
        Integer num = c48319LZs.A05;
        if (num != null) {
            igdsBanner.setIcon(num.intValue());
        } else {
            igdsBanner.setIcon((Drawable) null);
        }
        Integer num2 = c48319LZs.A03;
        if (num2 != null) {
            igdsBanner.setBody(num2.intValue());
        } else {
            igdsBanner.setBody(c48319LZs.A01, AbstractC166997dE.A0a());
        }
        Integer num3 = c48319LZs.A02;
        if (num3 != null) {
            igdsBanner.setAction(num3.intValue());
        } else {
            igdsBanner.setAction((CharSequence) null);
        }
        igdsBanner.setDismissible(c48319LZs.A07);
        igdsBanner.setDividerVisibility(c48319LZs.A00);
        Integer num4 = c48319LZs.A04;
        if (num4 != null) {
            igdsBanner.setDividerColor(num4.intValue());
        }
        igdsBanner.A00 = new C49476Ltp(3, this, c48319LZs);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C48319LZs.class;
    }
}
