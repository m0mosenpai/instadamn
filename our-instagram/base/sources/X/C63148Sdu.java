package X;

import android.content.Context;
import com.facebook.R;
import com.google.common.collect.ImmutableEntry;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.Sdu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63148Sdu {
    public final int A00;
    public final ImmutableRangeMap A01;
    public final HashMap A02;
    public final float[] A03;
    public final int[] A04;

    public static ImmutableEntry A00(Range range, int[] iArr, int i, int i2) {
        C09530e4 c09530e4 = new C09530e4(Integer.valueOf(iArr[i]), Integer.valueOf(iArr[i2]));
        C18C.A0A(range, "Range must not be empty, but was %s", !range.lowerBound.equals(range.upperBound));
        return new ImmutableEntry(range, c09530e4);
    }

    public static Range A01(float[] fArr, int i, int i2) {
        Float valueOf = Float.valueOf(fArr[i]);
        Float valueOf2 = Float.valueOf(fArr[i2]);
        Range range = Range.A00;
        valueOf.getClass();
        com.google.common.collect.Cut cut = new com.google.common.collect.Cut(valueOf);
        valueOf2.getClass();
        return new Range(cut, new com.google.common.collect.Cut(valueOf2));
    }

    public /* synthetic */ C63148Sdu(Context context) {
        this.A00 = context.getColor(AbstractC53242c7.A05(context));
        float[] fArr = {0.0f, 0.2f, 0.4f, 0.6f, 0.8f, 1.0f};
        this.A03 = fArr;
        int[] iArr = {AbstractC167007dF.A09(context, R.attr.igds_color_gradient_yellow), context.getColor(R.color.activator_card_progress_bad), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_red), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_pink), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_purple), AbstractC167007dF.A09(context, R.attr.igds_color_gradient_yellow)};
        this.A04 = iArr;
        ImmutableRangeMap immutableRangeMap = ImmutableRangeMap.A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        Range A01 = A01(fArr, 0, 1);
        C09530e4 A0o = AbstractC167007dF.A0o(Integer.valueOf(iArr[0]), iArr[1]);
        C18C.A0A(A01, "Range must not be empty, but was %s", !A01.lowerBound.equals(A01.upperBound));
        A1E.add(new ImmutableEntry(A01, A0o));
        A1E.add(A00(A01(fArr, 1, 2), iArr, 1, 2));
        A1E.add(A00(A01(fArr, 2, 3), iArr, 2, 3));
        A1E.add(A00(A01(fArr, 3, 4), iArr, 3, 4));
        A1E.add(A00(Range.A00(Float.valueOf(fArr[4]), Float.valueOf(fArr[5])), iArr, 4, 5));
        this.A01 = S34.A00(A1E);
        this.A02 = AbstractC166987dD.A1G();
    }
}
