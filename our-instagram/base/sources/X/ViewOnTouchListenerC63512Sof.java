package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.Sof, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnTouchListenerC63512Sof implements View.OnTouchListener {
    public static final Pattern A08 = Pattern.compile("(?i)^https://(.*)\\.facebook\\.com/(flx/warn|fblynx/warn|si/linkclick/warn)/(.*)");
    public boolean A00;
    public boolean A01;
    public final C02N A02;
    public final C63305ShB A03;
    public final C23016ACq A04;
    public final String A05;
    public final List A06;
    public final List A07;

    public ViewOnTouchListenerC63512Sof(C02N c02n, C63305ShB c63305ShB, C23016ACq c23016ACq, String str, List list, List list2) {
        this.A04 = c23016ACq;
        this.A05 = str;
        this.A03 = c63305ShB;
        this.A06 = list;
        this.A07 = list2;
        this.A02 = c02n;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            C23016ACq c23016ACq = this.A04;
            if (c23016ACq.A0p) {
                c23016ACq.A01++;
            }
        }
        if (!this.A00) {
            this.A00 = true;
            if (view != null) {
                R7V.A00(view).A0c = true;
            }
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                it.next();
            }
            C63305ShB c63305ShB = this.A03;
            C63305ShB.A02(new QDW(c63305ShB, 0), c63305ShB, false);
        }
        if (!this.A01) {
            String str = this.A05;
            if (str != null) {
                if (!AbstractC31175DnJ.A1Z(str, A08)) {
                    this.A02.accept(true);
                    for (C58881QEr c58881QEr : this.A06) {
                        if (!c58881QEr.A02) {
                            C58881QEr.A00(c58881QEr);
                        }
                    }
                    this.A01 = true;
                }
            }
            return false;
        }
        Iterator it2 = this.A07.iterator();
        while (it2.hasNext()) {
            ((InterfaceC65639Tq2) it2.next()).DuA(motionEvent, view);
        }
        return false;
    }
}
