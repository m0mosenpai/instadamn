package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.GuJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38382GuJ extends C1I4 {
    public final /* synthetic */ IntentAwareAdPivotState A00;
    public final /* synthetic */ HBC A01;
    public final /* synthetic */ C64062vR A02;

    public C38382GuJ(IntentAwareAdPivotState intentAwareAdPivotState, HBC hbc, C64062vR c64062vR) {
        this.A00 = intentAwareAdPivotState;
        this.A02 = c64062vR;
        this.A01 = hbc;
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A0N = AbstractC167017dG.A0N(recyclerView, -1864330349);
        if (i == 0) {
            IntentAwareAdPivotState intentAwareAdPivotState = this.A00;
            if (!intentAwareAdPivotState.A0A) {
                intentAwareAdPivotState.A0A = true;
                this.A02.A08.A0E(intentAwareAdPivotState, this.A01);
            }
            Handler handler = IBH.A00;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new RunnableC43118J4h(recyclerView, intentAwareAdPivotState), 200L);
        }
        C0f9.A0A(-1308309969, A0N);
    }
}
