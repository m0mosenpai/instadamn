package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.AudienceGeoLocation;

/* loaded from: classes11.dex */
public final class UGX extends C2UU {
    public final int A00;
    public final Object A01;

    public UGX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03;
        int length;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1965338881);
                length = ((UFT) ((V04) this.A01).A0B.getValue()).A06().A05.size();
                i = 261337360;
                break;
            case 1:
                A03 = C0f9.A03(-673458996);
                length = ((C69157Vim) this.A01).A02.length;
                i = 1507272717;
                break;
            case 2:
                A03 = C0f9.A03(778428840);
                length = ((C69155Vik) this.A01).A02.length;
                i = -1925710679;
                break;
            default:
                A03 = C0f9.A03(-1278023830);
                C69156Vil c69156Vil = (C69156Vil) this.A01;
                length = c69156Vil.A02[0].length * c69156Vil.A01.length;
                i = 1890511346;
                break;
        }
        C0f9.A0A(i, A03);
        return length;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        TextView textView;
        int i2;
        C69158Vin c69158Vin;
        switch (this.A00) {
            case 0:
                UHl uHl = (UHl) c3oo;
                C14360o3.A0B(uHl, 0);
                AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) ((UFT) ((V04) this.A01).A0B.getValue()).A06().A05.get(i);
                C14360o3.A0B(audienceGeoLocation, 0);
                uHl.A00.setText(audienceGeoLocation.A05);
                WNP.A00(uHl.itemView, 9, audienceGeoLocation, uHl);
                return;
            case 1:
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UIB) c3oo).A00;
                C69157Vim c69157Vim = (C69157Vim) this.A01;
                textView.setText(c69157Vim.A02[i]);
                C69158Vin[] c69158VinArr = c69157Vim.A01;
                textView.setMaxLines(c69158VinArr[i].A01);
                textView.getPaint().setFakeBoldText(true);
                i2 = c69157Vim.A00;
                c69158Vin = c69158VinArr[i];
                AbstractC13880nE.A0h(textView, i2, c69158Vin.A00);
                return;
            case 2:
                int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UIB) c3oo).A00;
                C69155Vik c69155Vik = (C69155Vik) this.A01;
                textView.setText(c69155Vik.A02[i]);
                textView.getPaint().setFakeBoldText(true);
                c69158Vin = c69155Vik.A01;
                textView.setMaxLines(c69158Vin.A01);
                i2 = c69155Vik.A00;
                AbstractC13880nE.A0h(textView, i2, c69158Vin.A00);
                return;
            default:
                C69156Vil c69156Vil = (C69156Vil) this.A01;
                String[][] strArr = c69156Vil.A02;
                int length = strArr[0].length;
                int i5 = i / length;
                int i6 = i % length;
                int i7 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                textView = ((UIB) c3oo).A00;
                textView.setText(strArr[i5][i6]);
                C69158Vin[] c69158VinArr2 = c69156Vil.A01;
                textView.setMaxLines(c69158VinArr2[i5].A01);
                i2 = c69156Vil.A00;
                c69158Vin = c69158VinArr2[i5];
                AbstractC13880nE.A0h(textView, i2, c69158Vin.A00);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.UHl] */
    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.A00 != 0) {
            return new UIB((TextView) AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.size_chart_cell_item));
        }
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.promote_create_audience_selected_location, false);
        XAC xac = ((V04) this.A01).A06;
        AbstractC167017dG.A1P(A0D, xac);
        ?? c3oo = new C3OO(A0D);
        c3oo.A01 = xac;
        c3oo.A00 = AbstractC167007dF.A0N(A0D, R.id.selected_location_name);
        return c3oo;
    }
}
