package X;

import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;

/* renamed from: X.Vvq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69804Vvq {
    public static final int[] A01(RectF rectF, C122845hK c122845hK, final InterfaceC16620sF interfaceC16620sF, int i) {
        GraphemeClusterSegmentFinder graphemeClusterSegmentFinder;
        Layout layout = c122845hK.A09;
        CharSequence text = layout.getText();
        if (i == 1) {
            graphemeClusterSegmentFinder = VKQ.A00(new C63585Sps(c122845hK.A06(), text));
        } else {
            graphemeClusterSegmentFinder = new GraphemeClusterSegmentFinder(text, c122845hK.A0A);
        }
        return layout.getRangeForRect(rectF, graphemeClusterSegmentFinder, new Layout.TextInclusionStrategy() { // from class: X.WKT
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                boolean booleanValue;
                booleanValue = ((Boolean) InterfaceC16620sF.this.invoke(rectF2, rectF3)).booleanValue();
                return booleanValue;
            }
        });
    }
}
