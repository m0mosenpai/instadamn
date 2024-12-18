package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.R;
import com.instagram.model.shopping.sizechart.SizeChart;
import com.instagram.model.shopping.sizechart.SizeChartMeasurement;
import com.instagram.model.shopping.sizechart.SizeChartRow;
import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class W3D {
    public TextPaint A00;
    public C69157Vim A01;
    public C69158Vin A02;
    public List A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final List A09;
    public final List A0A;
    public final List A0B;

    public W3D(Context context, SizeChart sizeChart) {
        int i;
        int i2;
        this.A08 = context;
        this.A07 = AbstractC167017dG.A03(context);
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.auth_credential_title_text_size);
        this.A05 = AbstractC167017dG.A03(context);
        this.A04 = AbstractC167017dG.A06(context);
        List unmodifiableList = Collections.unmodifiableList(sizeChart.A01);
        C14360o3.A07(unmodifiableList);
        this.A09 = unmodifiableList;
        ArrayList arrayList = new ArrayList();
        Iterator A0i = AbstractC31177DnL.A0i(sizeChart.A02);
        while (A0i.hasNext()) {
            arrayList.add(((SizeChartRow) A0i.next()).A00);
        }
        this.A0B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        String str = sizeChart.A00;
        Iterator A0i2 = AbstractC31177DnL.A0i(sizeChart.A02);
        while (A0i2.hasNext()) {
            SizeChartRow sizeChartRow = (SizeChartRow) A0i2.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator A0i3 = AbstractC31177DnL.A0i(sizeChartRow.A01);
            while (A0i3.hasNext()) {
                SizeChartMeasurement sizeChartMeasurement = (SizeChartMeasurement) A0i3.next();
                String str2 = sizeChartMeasurement.A03;
                if (str2 == null) {
                    Integer num = sizeChartMeasurement.A01;
                    Integer num2 = sizeChartMeasurement.A00;
                    StringBuilder sb = new StringBuilder();
                    if (num != null) {
                        if (num2 != null) {
                            sb.append(AbstractC13670mt.A06("%d - %d", num, num2));
                        } else {
                            sb.append(num);
                        }
                    } else {
                        sb.append(num2);
                    }
                    if (str != null) {
                        sb.append(" ");
                        sb.append(str);
                    }
                    str2 = sb.toString();
                }
                arrayList3.add(str2);
            }
            arrayList2.add(arrayList3);
        }
        this.A0A = arrayList2;
        TextPaint textPaint = new TextPaint();
        this.A00 = textPaint;
        textPaint.setTextSize(context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        AbstractC166987dD.A1N(context, this.A00, AbstractC53242c7.A07(context));
        this.A00.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        Context context2 = this.A08;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.avatar_upsell_sheet_image_height);
        int A03 = AbstractC167017dG.A03(context2);
        TextPaint textPaint2 = this.A00;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        C57482kN c57482kN = new C57482kN(alignment, textPaint2, null, 0.0f, 1.0f, dimensionPixelSize, false);
        List list = this.A0B;
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            StaticLayout A00 = c57482kN.A00((String) it.next());
            for (int i4 = 0; i4 < A00.getLineCount(); i4++) {
                i3 = Math.max(i3, (int) A00.getLineWidth(i4));
            }
        }
        int i5 = i3 + (A03 * 2);
        int A0A = ((AbstractC13880nE.A0A(context2) - i5) - (this.A05 * 2)) - 1;
        List list2 = this.A09;
        int size = list2.size();
        loop5: while (true) {
            if (size >= 2) {
                i = size - 1;
                C57482kN c57482kN2 = new C57482kN(alignment, this.A00, null, 0.0f, 1.0f, (A0A - (this.A04 * i)) / size, false);
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!A00(c57482kN2, (String) it2.next())) {
                            break;
                        }
                    } else {
                        while (i2 < list.size() * list2.size()) {
                            i2 = A00(c57482kN2, (String) ((List) this.A0A.get(i2 / list2.size())).get(i2 % list2.size())) ? i2 + 1 : 0;
                        }
                        break loop5;
                    }
                }
            } else {
                size = Math.min(list2.size(), 2);
                break;
            }
            size = i;
        }
        int i6 = (A0A - ((size - 1) * this.A04)) / size;
        TextPaint textPaint3 = this.A00;
        C57482kN c57482kN3 = new C57482kN(alignment, textPaint3, null, 0.0f, 1.0f, i5, false);
        C57482kN c57482kN4 = new C57482kN(alignment, textPaint3, null, 0.0f, 1.0f, i6, false);
        C69158Vin[] c69158VinArr = new C69158Vin[list.size()];
        Arrays.fill(c69158VinArr, new C69158Vin(this, 1));
        for (int i7 = 0; i7 < list.size(); i7++) {
            for (int i8 = 0; i8 < list2.size(); i8++) {
                int lineCount = c57482kN4.A00((CharSequence) ((List) this.A0A.get(i7)).get(i8)).getLineCount();
                if (lineCount > c69158VinArr[i7].A01) {
                    c69158VinArr[i7] = new C69158Vin(this, Math.min(lineCount, 2));
                }
            }
            int lineCount2 = c57482kN3.A00((CharSequence) list.get(i7)).getLineCount();
            if (lineCount2 > c69158VinArr[i7].A01) {
                c69158VinArr[i7] = new C69158Vin(this, Math.min(lineCount2, 2));
            }
        }
        this.A01 = new C69157Vim(c69158VinArr, AbstractC31173DnH.A1b(list, list.size()), i5);
        C57482kN c57482kN5 = new C57482kN(alignment, this.A00, null, 0.0f, 1.0f, i6, false);
        C69158Vin c69158Vin = new C69158Vin(this, 1);
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            int lineCount3 = c57482kN5.A00((String) it3.next()).getLineCount();
            if (lineCount3 > c69158Vin.A01) {
                c69158Vin = new C69158Vin(this, Math.min(lineCount3, 2));
            }
        }
        this.A02 = c69158Vin;
        ArrayList arrayList4 = new ArrayList();
        int size2 = list2.size();
        int i9 = 0;
        while (i9 < size2) {
            int i10 = i9 + size;
            int min = Math.min(i10, size2);
            String[] strArr = new String[size];
            list2.subList(i9, min).toArray(strArr);
            C69155Vik c69155Vik = new C69155Vik(c69158Vin, strArr, i6);
            String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), size);
            for (int i11 = 0; i11 < list.size(); i11++) {
                String[] strArr3 = new String[size];
                ((List) this.A0A.get(i11)).subList(i9, min).toArray(strArr3);
                strArr2[i11] = strArr3;
            }
            arrayList4.add(new VgE(c69155Vik, new C69156Vil(c69158VinArr, strArr2, i6)));
            i9 = i10;
        }
        this.A03 = arrayList4;
    }

    private boolean A00(C57482kN c57482kN, String str) {
        if (this.A00.measureText(str) <= c57482kN.A00) {
            return true;
        }
        StaticLayout A00 = c57482kN.A00(str);
        if (A00.getLineCount() <= 1) {
            return true;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        for (int i = 0; i < A00.getLineCount(); i++) {
            if (!wordInstance.isBoundary(A00.getLineStart(i))) {
                return false;
            }
        }
        if (A00.getLineCount() <= 2) {
            return true;
        }
        return false;
    }
}
