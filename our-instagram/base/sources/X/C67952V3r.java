package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.ui.base.IgTextView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.V3r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67952V3r extends C1P1 {
    public final /* synthetic */ C70169WEl A00;

    public C67952V3r(C70169WEl c70169WEl) {
        this.A00 = c70169WEl;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        Object A00;
        int A03 = C0f9.A03(-931152586);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            A01.getMessage();
        } else if ((abstractC115105If instanceof C115115Ig) && (A00 = abstractC115105If.A00()) != null) {
            ((InterfaceC40821up) A00).getErrorMessage();
        }
        C70169WEl c70169WEl = this.A00;
        c70169WEl.A00.A02(303965077);
        c70169WEl.A0D.DFT();
        V1X v1x = c70169WEl.A08;
        EnumC65855TvH enumC65855TvH = c70169WEl.A0B;
        if (enumC65855TvH == null || EnumC65855TvH.A1E != enumC65855TvH) {
            AbstractC35261Fgv.A03(v1x.getActivity());
        }
        C0f9.A0A(-1911217962, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        C0f9.A0A(1242288525, C0f9.A03(834743181));
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1220533332);
        this.A00.A00.A03(303965077);
        C0f9.A0A(1701133533, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        IgTextView igTextView;
        int A03 = C0f9.A03(-1985509767);
        C67831Uz4 c67831Uz4 = (C67831Uz4) obj;
        int A032 = C0f9.A03(1772396484);
        C69398Vmi c69398Vmi = c67831Uz4.A00;
        if (c69398Vmi.A03.booleanValue()) {
            C70169WEl c70169WEl = this.A00;
            c70169WEl.A00.A04(303965077);
            String str = c69398Vmi.A04;
            c70169WEl.A03 = str;
            c70169WEl.A02 = c67831Uz4.A01;
            V1X v1x = c70169WEl.A08;
            CharSequence A00 = C70169WEl.A00(c70169WEl, str);
            C189478aR c189478aR = v1x.A05;
            c189478aR.getClass();
            c189478aR.A0M(c69398Vmi.A02.A00);
            if (c69398Vmi.A00 != null && (igTextView = v1x.A04) != null) {
                igTextView.setVisibility(0);
                v1x.A04.setText(c69398Vmi.A00.A00());
                AbstractC25227BEk.A11(v1x.A04);
            }
            C67915V2f c67915V2f = v1x.A08;
            String str2 = c69398Vmi.A01.A00;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) c69398Vmi.A06);
            c67915V2f.A03 = str2;
            c67915V2f.A02 = A00;
            List list = c67915V2f.A04;
            list.clear();
            if (copyOf != null && !copyOf.isEmpty()) {
                list.addAll(copyOf);
            }
            c67915V2f.A01 = null;
            c67915V2f.A00 = null;
            C67915V2f.A00(c67915V2f);
            if (v1x.A0W() != null) {
                v1x.A0W().post(new RunnableC71392Wt1(v1x));
            }
            HashMap hashMap = c69398Vmi.A05;
            if (hashMap != null) {
                c70169WEl.A0D.FC0(hashMap);
            }
        } else {
            C70169WEl c70169WEl2 = this.A00;
            C70155WDf c70155WDf = c70169WEl2.A00;
            c70155WDf.A02(303965077);
            c70155WDf.A07((short) 97);
            c70169WEl2.A0D.DFT();
            V1X v1x2 = c70169WEl2.A08;
            EnumC65855TvH enumC65855TvH = c70169WEl2.A0B;
            if (enumC65855TvH == null || EnumC65855TvH.A1E != enumC65855TvH) {
                AbstractC35261Fgv.A03(v1x2.getActivity());
            }
        }
        C0f9.A0A(-1226981264, A032);
        C0f9.A0A(420279273, A03);
    }
}
