package X;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;

/* renamed from: X.Ikc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42069Ikc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C41155IJu A00;
    public final /* synthetic */ C3K0 A01;

    public C42069Ikc(C41155IJu c41155IJu, C3K0 c3k0) {
        this.A01 = c3k0;
        this.A00 = c41155IJu;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C3K0 c3k0 = this.A01;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        if (c3k0.A06) {
            C41155IJu c41155IJu = this.A00;
            C41128IIt c41128IIt = (C41128IIt) c41155IJu.A04.get(c3k0.A00);
            if (c41128IIt.A01 == C05F.A01) {
                ((C41101IHs) c41128IIt.A04.get(i)).A03 = !r1.A03;
                Adapter adapter = adapterView.getAdapter();
                C14360o3.A0C(adapter, "null cannot be cast to non-null type com.instagram.feed.survey.MultiQuestionSurveyAdapter");
                ((HEB) adapter).A0C();
                return;
            }
            Object itemAtPosition = adapterView.getItemAtPosition(i);
            C14360o3.A0C(itemAtPosition, "null cannot be cast to non-null type com.instagram.feed.model.MultiQuestionSurvey.PossibleAnswer");
            C41101IHs c41101IHs = (C41101IHs) itemAtPosition;
            c41101IHs.A00++;
            C3K0.A01(c41155IJu, c3k0, new String[]{c41101IHs.A02});
        }
    }
}
