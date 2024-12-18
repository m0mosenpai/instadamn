package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Miw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51153Miw extends C2UU {
    public C51638MrV A00;
    public C56120Ovf A01;
    public boolean A02;
    public final N5G A03;
    public final C52348NEm A04;

    public C51153Miw(N5G n5g) {
        C14360o3.A0B(n5g, 1);
        this.A03 = n5g;
        this.A04 = new C52348NEm(null);
        this.A01 = new C56120Ovf(EnumC33419Epq.NONE, "load_more_default_key");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x015c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0284  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r13, int r14) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51153Miw.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C52348NEm c52348NEm = this.A04;
                        LayoutInflater.from(viewGroup.getContext());
                        return c52348NEm.A00(viewGroup);
                    }
                    throw AbstractC166987dD.A12(AnonymousClass001.A0c("View type ", " is not supported", i));
                }
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C51340Mm1(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.monetization_product_violations, false), this.A03);
            }
            int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C51283Ml6(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.monetization_product_tool_tips, false));
        }
        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C51331Mls(AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.monetization_product_tool_eligibility_header, false), this.A03);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1574776582);
        C51638MrV c51638MrV = this.A00;
        int i = 1;
        if (c51638MrV == null || !c51638MrV.A09) {
            i = 2;
        }
        C0f9.A0A(-1724402029, A03);
        return i;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(508240540);
        C51638MrV c51638MrV = this.A00;
        int i2 = 1;
        if (c51638MrV != null && c51638MrV.A09) {
            i2 = 3;
        } else if (i == 0) {
            i2 = 0;
        } else if (c51638MrV == null || !c51638MrV.A08 || this.A02) {
            i2 = 2;
        }
        C0f9.A0A(1119482822, A03);
        return i2;
    }
}
