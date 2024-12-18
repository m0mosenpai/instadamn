package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.TreeSet;

/* loaded from: classes11.dex */
public final class UGc extends C2UU {
    public ImmutableList A00;
    public boolean A01;
    public final C68743VbM A02;
    public final TreeSet A03;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.ai_subscription_item_row, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(2787));
        return new UI2((IgdsListCell) inflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        StringBuilder sb;
        String A09;
        String A0A;
        UI2 ui2 = (UI2) c3oo;
        C14360o3.A0B(ui2, 0);
        C2JS c2js = (C2JS) this.A00.get(i);
        IgdsListCell igdsListCell = ui2.A00;
        String A08 = c2js.A08(DialogModule.KEY_TITLE);
        String str = "";
        if (A08 == null) {
            A08 = "";
        }
        igdsListCell.A0I(A08);
        String A092 = c2js.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
        if (A092 != null && !AbstractC001900j.A0T(A092) && (A0A = c2js.A0A("send_time_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)")) != null && !AbstractC001900j.A0T(A0A)) {
            sb = new StringBuilder();
            String A093 = c2js.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
            if (A093 == null) {
                A093 = "";
            }
            sb.append(A093);
            A09 = ", ";
        } else {
            sb = new StringBuilder();
            A09 = c2js.A09("send_frequency_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
            if (A09 == null) {
                A09 = "";
            }
        }
        sb.append(A09);
        String A0A2 = c2js.A0A("send_time_with_timezone_offset(gmt_offset_seconds:$gmt_offset_seconds)");
        if (A0A2 != null) {
            str = A0A2;
        }
        igdsListCell.A0H(AbstractC166997dE.A0x(str, sb));
        if (this.A01) {
            igdsListCell.setTextCellType(EnumC53237Nga.A03);
            igdsListCell.setChecked(this.A03.contains(Integer.valueOf(i)));
            igdsListCell.A0D(new C70266WOu(i, 0, this));
            return;
        }
        igdsListCell.setTextCellType(EnumC53237Nga.A09);
    }

    public UGc(C68743VbM c68743VbM) {
        this.A02 = c68743VbM;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        this.A00 = of;
        this.A03 = new TreeSet();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(874972599);
        int size = this.A00.size();
        C0f9.A0A(865279749, A03);
        return size;
    }
}
