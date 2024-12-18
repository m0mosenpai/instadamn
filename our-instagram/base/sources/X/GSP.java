package X;

import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class GSP extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01 = 0;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSP(IgTextView igTextView, C32249EIi c32249EIi, IgdsListCell igdsListCell, IgdsListCell igdsListCell2, IgdsListCell igdsListCell3, IgdsListCell igdsListCell4, IgdsListCell igdsListCell5, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = igdsListCell;
        this.A06 = igdsListCell2;
        this.A04 = igdsListCell3;
        this.A03 = igdsListCell4;
        this.A05 = igdsListCell5;
        this.A08 = c32249EIi;
        this.A07 = igTextView;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A01 != 0) {
            IgdsListCell igdsListCell = (IgdsListCell) this.A02;
            IgdsListCell igdsListCell2 = (IgdsListCell) this.A06;
            IgdsListCell igdsListCell3 = (IgdsListCell) this.A04;
            IgdsListCell igdsListCell4 = (IgdsListCell) this.A03;
            IgdsListCell igdsListCell5 = (IgdsListCell) this.A05;
            GSP gsp = new GSP((IgTextView) this.A07, (C32249EIi) this.A08, igdsListCell, igdsListCell2, igdsListCell3, igdsListCell4, igdsListCell5, interfaceC23621Ds);
            gsp.A00 = obj;
            return gsp;
        }
        N0Z n0z = (N0Z) this.A08;
        C55191Odx c55191Odx = (C55191Odx) this.A03;
        C54993OUc c54993OUc = (C54993OUc) this.A02;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A06;
        return new GSP(n0z, c54993OUc, c55191Odx, (C6FQ) this.A04, interfaceC103384lE, (InterfaceC103384lE) this.A05, (InterfaceC103384lE) this.A07, (File) this.A00, interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C25531Mh A00;
        if (this.A01 != 0) {
            AbstractC09560e7.A00(obj);
            C51761Mtk c51761Mtk = (C51761Mtk) this.A00;
            boolean z = true;
            ((IgdsListCell) this.A02).setChecked(AbstractC167007dF.A1X(c51761Mtk.A02, EnumC33411Epi.A04));
            IgdsListCell igdsListCell = (IgdsListCell) this.A06;
            EnumC33411Epi enumC33411Epi = (EnumC33411Epi) c51761Mtk.A02;
            igdsListCell.setChecked(AbstractC167007dF.A1X(enumC33411Epi, EnumC33411Epi.A08));
            ((IgdsListCell) this.A04).setChecked(AbstractC167007dF.A1X(enumC33411Epi, EnumC33411Epi.A06));
            ((IgdsListCell) this.A03).setChecked(AbstractC167007dF.A1X(enumC33411Epi, EnumC33411Epi.A05));
            IgdsListCell igdsListCell2 = (IgdsListCell) this.A05;
            if (enumC33411Epi != EnumC33411Epi.A07) {
                z = false;
            }
            igdsListCell2.setChecked(z);
            C32249EIi c32249EIi = (C32249EIi) this.A08;
            TextView textView = (TextView) this.A07;
            Calendar calendar = Calendar.getInstance();
            if (enumC33411Epi.ordinal() == 0) {
                textView.setText(2131959468);
            } else {
                calendar.add(13, enumC33411Epi.A00);
                AbstractC31177DnL.A10(textView, c32249EIi, new SimpleDateFormat("MMM d, yyyy", Locale.getDefault()).format(Long.valueOf(calendar.getTimeInMillis())), 2131959469);
            }
            FFH ffh = c32249EIi.A00;
            if (ffh == null) {
                str = "delegate";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            EL4 el4 = ffh.A00;
            ((AbstractC31791DyA) el4.A0I.getValue()).A0A.Egh(enumC33411Epi);
            if (EL4.A00(el4) == EnumC33330EoP.A02) {
                C142846ck A0d = AbstractC31172DnG.A0d(el4.A0F);
                A00 = AbstractC31172DnG.A0I(A0d);
                if (AbstractC25226BEj.A1Z(A00)) {
                    AbstractC31178DnM.A1F(A00, A0d.A04);
                    AbstractC31174DnI.A1I(A00, "select_channel_duration_option");
                    A00.A0u(AbstractC31180DnO.A0e(A00, A0d, "channel_duration_sheet"));
                    A00.Cht();
                }
                return C0eB.A00;
            }
            if (EL4.A00(el4) == EnumC33330EoP.A03) {
                C36299Fzu c36299Fzu = (C36299Fzu) el4.A0H.getValue();
                A00 = C36299Fzu.A00(c36299Fzu);
                if (AbstractC25226BEj.A1Z(A00)) {
                    AbstractC31178DnM.A1F(A00, c36299Fzu.A03);
                    AbstractC31174DnI.A1I(A00, "select_channel_duration_option");
                    A00.A0o("channel_duration_sheet");
                    C36299Fzu.A05(A00, c36299Fzu, "chat_setup");
                    A00.Cht();
                }
            }
            return C0eB.A00;
        }
        AbstractC09560e7.A00(obj);
        N0Z n0z = (N0Z) this.A08;
        InterfaceC58100PpP interfaceC58100PpP = n0z.A00;
        if (interfaceC58100PpP == null) {
            str = "uploader";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        C55191Odx c55191Odx = (C55191Odx) this.A03;
        C54993OUc c54993OUc = (C54993OUc) this.A02;
        InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A06;
        interfaceC58100PpP.En2(c54993OUc, c55191Odx, new C55653One(n0z, (C6FQ) this.A04, interfaceC103384lE, (InterfaceC103384lE) this.A05, (InterfaceC103384lE) this.A07, (File) this.A00));
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GSP) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSP(N0Z n0z, C54993OUc c54993OUc, C55191Odx c55191Odx, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, InterfaceC103384lE interfaceC103384lE3, File file, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A08 = n0z;
        this.A03 = c55191Odx;
        this.A02 = c54993OUc;
        this.A06 = interfaceC103384lE;
        this.A04 = c6fq;
        this.A00 = file;
        this.A05 = interfaceC103384lE2;
        this.A07 = interfaceC103384lE3;
    }
}
