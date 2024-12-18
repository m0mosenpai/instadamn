package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public final class JnY extends C2UU {
    public C62862tP A00;
    public UserSession A01;
    public C68817VcY A02;
    public V01 A03;
    public C46503Ki2 A04;
    public Integer A05;
    public String A06;
    public List A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r2.isEmpty() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C41136IJb A00(int r4) {
        /*
            r3 = this;
            java.util.List r2 = r3.A07
            boolean r0 = r3.A08
            if (r0 != 0) goto Ld
            boolean r1 = r2.isEmpty()
            r0 = 2
            if (r1 == 0) goto Le
        Ld:
            r0 = 0
        Le:
            int r4 = r4 - r0
            java.lang.Object r0 = r2.get(r4)
            X.IJb r0 = (X.C41136IJb) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JnY.A00(int):X.IJb");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007e  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r32, int r33) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JnY.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            return new C3OO(new View(viewGroup.getContext()));
                        }
                        return new C44652Jpw(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.info_center_loading_spinner));
                    }
                    return (C3OO) AbstractC31172DnG.A0x(IQa.A00(viewGroup));
                }
                return new C44726Jr9(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.voting_info_center_state_selector));
            }
            return new C44725Jr8(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.voting_info_center_share_with_friends));
        }
        return new C44763Jrk(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.voting_info_center_header), this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (r4.A07.isEmpty() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r4.A07.isEmpty() != false) goto L20;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getItemCount() {
        /*
            r4 = this;
            r0 = 123022233(0x7552b99, float:1.6037151E-34)
            int r3 = X.C0f9.A03(r0)
            java.lang.Integer r0 = r4.A05
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L37
            r0 = 2
            if (r1 == r0) goto L23
            r0 = 0
            if (r1 == r0) goto L23
            java.lang.String r0 = "Unrecognized state when calculating item count"
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A14(r0)
            r0 = 1750476359(0x68562647, float:4.04517E24)
            X.C0f9.A0A(r0, r3)
            throw r1
        L23:
            boolean r0 = r4.A08
            if (r0 != 0) goto L30
            java.util.List r0 = r4.A07
            boolean r1 = r0.isEmpty()
            r0 = 2
            if (r1 == 0) goto L31
        L30:
            r0 = 0
        L31:
            int r2 = r0 + 1
            r0 = -702227581(0xffffffffd624db83, float:-4.5315676E13)
            goto L4f
        L37:
            java.util.List r0 = r4.A07
            int r2 = r0.size()
            boolean r0 = r4.A08
            if (r0 != 0) goto L4a
            java.util.List r0 = r4.A07
            boolean r1 = r0.isEmpty()
            r0 = 2
            if (r1 == 0) goto L4b
        L4a:
            r0 = 0
        L4b:
            int r2 = r2 + r0
            r0 = -770436863(0xffffffffd2141101, float:-1.5898511E11)
        L4f:
            X.C0f9.A0A(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JnY.getItemCount():int");
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-1224578953);
        if (!this.A08 && !this.A07.isEmpty()) {
            if (i == 0) {
                i2 = 0;
                i3 = 1355883291;
            } else if (i == 1) {
                i2 = 5;
                i3 = -1589293864;
            }
            C0f9.A0A(i3, A03);
            return i2;
        }
        Integer num = this.A05;
        Integer num2 = C05F.A01;
        if (num == num2 && A00(i).A04 == C05F.A0C) {
            i2 = 4;
            i3 = 418775074;
        } else {
            int A032 = C0f9.A03(-99946725);
            int intValue = this.A05.intValue();
            i2 = 3;
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 0) {
                        i2 = 2;
                    } else {
                        IllegalStateException A0V = AbstractC31175DnJ.A0V(AbstractC111324zv.A00(339), "LOADING");
                        C0f9.A0A(1071285006, A032);
                        throw A0V;
                    }
                }
            } else {
                i2 = -1;
                if (A00(i).A04 == num2) {
                    i2 = 1;
                }
            }
            C0f9.A0A(-125698560, A032);
            i3 = -2019032825;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
