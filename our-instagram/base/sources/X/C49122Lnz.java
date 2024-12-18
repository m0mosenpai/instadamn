package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.HashMap;

/* renamed from: X.Lnz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49122Lnz implements C7QC {
    public final C7Q8 A00;
    public final C7Q8 A01;
    public final InterfaceC165247aD A02;
    public final C49125Lo4 A03;
    public final C158907Bc A04;
    public final C162907Rb A05;
    public final HashMap A06 = AbstractC166987dD.A1G();
    public final boolean A07;
    public final boolean A08;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C49157Loa c49157Loa = (C49157Loa) c7qd;
        KT4 kt4 = (KT4) interfaceC129555tK;
        C49125Lo4 c49125Lo4 = this.A03;
        C49169Lom c49169Lom = c49157Loa.A02;
        C163157Sa c163157Sa = kt4.A00;
        c49125Lo4.ADy(c49169Lom, c163157Sa);
        AnonymousClass781 anonymousClass781 = kt4.A01;
        if (anonymousClass781 != null) {
            this.A04.ADy(c49157Loa.A03, anonymousClass781);
        }
        C7QH c7qh = c49169Lom.A01;
        if (c7qh != null) {
            ((C7QG) c7qh).A00 = c163157Sa;
        }
        C7QH BYl = c49157Loa.A03.BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = anonymousClass781;
        }
        this.A05.A02(c49157Loa, kt4);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49157Loa c49157Loa = (C49157Loa) c7qd;
        C49125Lo4 c49125Lo4 = this.A03;
        C49169Lom c49169Lom = c49157Loa.A02;
        c49125Lo4.F91(c49169Lom);
        C158907Bc c158907Bc = this.A04;
        C7BF c7bf = c49157Loa.A03;
        c158907Bc.F91(c7bf);
        C7QH c7qh = c49169Lom.A01;
        if (c7qh != null) {
            ((C7QG) c7qh).A00 = null;
        }
        C7QH BYl = c7bf.BYl();
        if (BYl != null) {
            ((C7QG) BYl).A00 = null;
        }
        this.A05.A01(c49157Loa);
    }

    public C49122Lnz(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, C49125Lo4 c49125Lo4, C158907Bc c158907Bc, C162907Rb c162907Rb) {
        this.A03 = c49125Lo4;
        this.A04 = c158907Bc;
        this.A05 = c162907Rb;
        this.A02 = interfaceC165247aD;
        boolean z = anonymousClass988.A1U;
        this.A08 = z;
        this.A07 = AbstractC167007dF.A1Z(anonymousClass988.A0d);
        this.A01 = new C158657Ab(interfaceC165247aD, z);
        this.A00 = new C158657Ab(interfaceC165247aD, z);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.7a9, X.7aJ, X.7aD, X.7ad, java.lang.Object, X.7a3] */
    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.container_with_legacy_text, viewGroup, false);
        C49125Lo4 c49125Lo4 = this.A03;
        C49169Lom c49169Lom = new C49169Lom(layoutInflater.inflate(R.layout.direct_media_share_message, viewGroup, false));
        c49125Lo4.A02.A00(c49169Lom);
        FrameLayout frameLayout = c49169Lom.A05;
        linearLayout.addView(frameLayout, frameLayout.getLayoutParams());
        C158907Bc c158907Bc = this.A04;
        C7BF c7bf = new C7BF((TextView) layoutInflater.inflate(R.layout.direct_text_message_text_view, viewGroup, false));
        c158907Bc.A03.A00(c7bf);
        TextView textView = c7bf.A03;
        linearLayout.addView(textView, textView.getLayoutParams());
        C49157Loa c49157Loa = new C49157Loa(linearLayout, c49169Lom, c7bf);
        this.A06.put(c7bf, c49157Loa);
        C49169Lom c49169Lom2 = c49157Loa.A02;
        ?? r15 = this.A02;
        C49008Llw c49008Llw = new C49008Llw(r15);
        C7Q8 c7q8 = this.A01;
        boolean z = this.A08;
        C7Q9 c7q9 = new C7Q9(r15, z);
        C162897Ra c162897Ra = new C162897Ra(r15);
        LinearLayout linearLayout2 = c49157Loa.A01;
        boolean z2 = this.A07;
        C7QF c7qf = new C7QF(linearLayout2, c162897Ra, c49008Llw, c7q8, c7q9, r15, c49169Lom2, z, true, z2);
        c49169Lom2.A01 = c7qf;
        c49169Lom2.A05.setOnTouchListener(c7qf);
        C7BF c7bf2 = c49157Loa.A03;
        C45892KSv c45892KSv = new C45892KSv(r15, this, c49157Loa);
        C7QF c7qf2 = new C7QF(linearLayout2, new C162897Ra(r15), new C158947Bg(r15), c45892KSv, new C7Q9(r15, z), r15, c7bf2, z, true, z2);
        TextView textView2 = c7bf2.A03;
        C7BK c7bk = new C7BK(c7qf2, linearLayout2, textView2, z);
        c7bf2.A01 = c7qf2;
        c7bf2.EZ4(c45892KSv);
        textView2.setOnTouchListener(c7bk);
        this.A05.A00(c49157Loa);
        return c49157Loa;
    }
}
