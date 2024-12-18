package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.StringTreeSet;
import com.instagram.business.promote.model.PromoteData;

/* loaded from: classes11.dex */
public final class WNV implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WNV(FragmentActivity fragmentActivity, PromoteData promoteData, int i) {
        this.A00 = i;
        switch (i) {
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
            case 65:
                this.A01 = fragmentActivity;
                this.A02 = promoteData;
                break;
            case 64:
            default:
                this.A02 = promoteData;
                this.A01 = fragmentActivity;
                break;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new WNV(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02af  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instructions count: 3762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WNV.onClick(android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.WQI, java.lang.Object] */
    public WNV(WPa wPa) {
        this.A00 = 1;
        this.A02 = wPa;
        Context context = wPa.A09.getContext();
        CharSequence charSequence = wPa.A0C;
        ?? obj = new Object();
        obj.A02 = 4096;
        obj.A01 = 4096;
        obj.A04 = null;
        obj.A05 = null;
        obj.A09 = false;
        obj.A0A = false;
        obj.A00 = 16;
        obj.A03 = context;
        obj.A07 = charSequence;
        this.A01 = obj;
    }

    public WNV(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
