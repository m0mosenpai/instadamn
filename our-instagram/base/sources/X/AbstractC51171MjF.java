package X;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.MjF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51171MjF extends C2UU {
    public static final int A05 = Calendar.getInstance().getActualMaximum(7);
    public final List A02 = AbstractC166987dD.A1E();
    public final Map A04 = AbstractC166987dD.A1G();
    public final DateFormat A00 = new SimpleDateFormat("MMMM yyyy");
    public final Map A03 = AbstractC166987dD.A1G();
    public final Calendar A01 = Calendar.getInstance();

    public static String A00(int i, int i2, int i3) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(i);
        A1C.append(":");
        if (i3 == -1) {
            A1C.append(i2);
        } else {
            A1C.append(i2);
            A1C.append(":");
            A1C.append(i3);
        }
        return A1C.toString();
    }

    public final String A01(Date date) {
        Calendar calendar = this.A01;
        calendar.setTime(date);
        return A00(calendar.get(1), calendar.get(2), calendar.get(5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (X.AbstractC50102Ry.A00(r5.A00, r2.getId()) == false) goto L18;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r25, int r26) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51171MjF.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        TextView textView;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Context context = viewGroup.getContext();
                        textView = new TextView(context);
                        AbstractC14710oj.A07(context, C52375NFr.A0D, textView, C05F.A01);
                        AbstractC31177DnL.A0z(textView, context);
                        textView.setTextSize(1, 16.0f);
                        Context context2 = ((C52375NFr) this).A06;
                        textView.setPadding(0, AbstractC166987dD.A0C(context2, 40), 0, MSX.A01(context2));
                        textView.setGravity(17);
                    } else {
                        throw AbstractC166987dD.A14("unsupported viewType");
                    }
                } else {
                    Context context3 = viewGroup.getContext();
                    textView = new TextView(context3);
                    AbstractC14710oj.A07(textView.getContext(), null, textView, C05F.A00);
                    AbstractC31177DnL.A0z(textView, context3);
                    textView.setGravity(17);
                    textView.setTextSize(1, 12.0f);
                    MSY.A10(textView, ((C52375NFr) this).A01, -2);
                }
            } else {
                textView = new TextView(viewGroup.getContext());
                textView.setBackgroundColor(Color.argb(0, 0, 0, 0));
            }
            return new C51233MkI(textView);
        }
        C52375NFr c52375NFr = (C52375NFr) this;
        return new C51378Mmd(AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.calendar_day_view), c52375NFr.A01, c52375NFr.A04);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-376809072);
        int size = this.A02.size();
        C0f9.A0A(590514223, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = C0f9.A03(-1344896365);
        Object obj = this.A02.get(i);
        if (obj instanceof O7D) {
            i2 = 0;
            i3 = -1129235607;
        } else if (obj instanceof C53878NsA) {
            i2 = 1;
            i3 = -1622569561;
        } else if (obj instanceof OT8) {
            i2 = 2;
            i3 = -519923697;
        } else if (obj instanceof C54387O1t) {
            i2 = 3;
            i3 = 1117374065;
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("unexpected item type");
            C0f9.A0A(1582319975, A03);
            throw A14;
        }
        C0f9.A0A(i3, A03);
        return i2;
    }
}
