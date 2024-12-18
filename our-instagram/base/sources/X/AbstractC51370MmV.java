package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import com.facebook.R;

/* renamed from: X.MmV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51370MmV extends C3OO {
    public TextWatcher A00;
    public TextWatcher A01;
    public final Context A02;
    public final View A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;

    public boolean A03() {
        return false;
    }

    private final InterfaceC09390do A00(int i) {
        return AbstractC09440dt.A00(EnumC09460dv.A02, new C57249PbX(i, 32, this));
    }

    public boolean A02() {
        if (this instanceof C52611NPg) {
            return ((C52611NPg) this).A00;
        }
        if (this instanceof C52610NPf) {
            return false;
        }
        if (this instanceof C52612NPh) {
            return ((C52612NPh) this).A02;
        }
        return ((C52613NPi) this).A03;
    }

    public boolean A04() {
        if (this instanceof C52613NPi) {
            return true;
        }
        return false;
    }

    public AbstractC51370MmV(View view) {
        super(view);
        this.A03 = view;
        this.A02 = AbstractC166997dE.A0L(view);
        this.A09 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57247PbV(this, 11));
        this.A0A = A00(R.id.mk_section_title_edit_text);
        this.A04 = A00(R.id.mk_section_description_edit_text);
        this.A07 = A00(R.id.mk_section_edit_button);
        this.A06 = A00(R.id.mk_section_edit_info_icon);
        this.A0B = A00(R.id.mk_section_title_text);
        this.A05 = A00(R.id.mk_section_description_text);
        this.A08 = A00(R.id.mk_section_edit_view_button);
        this.A0C = A00(R.id.mk_section_view_info_icon);
    }

    public static final void A01(AbstractC51370MmV abstractC51370MmV, InterfaceC16820sZ interfaceC16820sZ) {
        if (abstractC51370MmV.A02()) {
            interfaceC16820sZ.invoke();
        }
    }
}
