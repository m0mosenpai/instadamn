package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.U9c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66328U9c extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C66328U9c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Map map;
        switch (this.A00) {
            case 0:
                Dialog dialog = AbstractC68220VIg.A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                C0fJ.A00((Dialog) this.A02);
                return;
            case 1:
                R8W r8w = (R8W) this.A02;
                Intent intent = r8w.A02.getIntent();
                if (intent == null || intent.getBooleanExtra(AbstractC58317Pt9.A00(64), true)) {
                    Map map2 = ((VKC) r8w).A01;
                    if (map2 != null) {
                        map = new LinkedHashMap(map2);
                        map.put("TARGET_NAME", "OFFSITE_FOOTER_DISCLAIMER_CLICK");
                    } else {
                        map = null;
                    }
                    VDH vdh = VDH.A0O;
                    if (map == null) {
                        map = AbstractC06930Yk.A0E();
                    }
                    C70189WFs.A03(vdh, map);
                }
                IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(r8w.A04);
                Q1y q1y = ((VKC) r8w).A00;
                if (q1y == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                new BitSet(0);
                C66277U6x c66277U6x = new C66277U6x(AbstractC191768eY.A01(hashMap), hashMap2, "com.bloks.www.metacheckout.disclaimer.learnmore");
                AbstractC31178DnM.A1M(c66277U6x, 719983200);
                c66277U6x.A03 = null;
                c66277U6x.A02 = null;
                c66277U6x.A04 = null;
                c66277U6x.A08(hashMap3);
                c66277U6x.A05(q1y, igBloksScreenConfig);
                return;
            case 2:
                UFQ ufq = (UFQ) ((C67884V0q) this.A02).A0G.getValue();
                String valueOf = String.valueOf(((MUW) this.A01).A00);
                C14360o3.A0B(valueOf, 0);
                C70399WUb.A00(ufq.A08).A0G(VG4.A0P, "payment_inline_footer_row");
                UFQ.A01(ufq, valueOf, "enter_billing_wizard_by_clicking_entry");
                return;
            case 3:
                C69648Vsp c69648Vsp = (C69648Vsp) this.A02;
                c69648Vsp.A02.A0G(c69648Vsp.A01, "payment_inline_footer_row");
                c69648Vsp.A05.A0A(String.valueOf(((MUW) this.A01).A00), "enter_billing_wizard_by_clicking_entry", c69648Vsp.A00());
                return;
            default:
                ((Runnable) this.A02).run();
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        int A02;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1N(((W55) this.A01).A00, textPaint, R.color.info_dialog_link_color);
                z = false;
                break;
            case 1:
                z = false;
                C14360o3.A0B(textPaint, 0);
                A02 = C2FP.A0A().A02((Context) this.A01, 5);
                textPaint.setColor(A02);
                break;
            case 2:
            case 3:
            default:
                z = false;
                C14360o3.A0B(textPaint, 0);
                textPaint.setColor(textPaint.linkColor);
                textPaint.setFakeBoldText(true);
                break;
            case 4:
                z = false;
                C14360o3.A0B(textPaint, 0);
                Context context = (Context) this.A01;
                A02 = context.getColor(AbstractC53242c7.A06(context));
                textPaint.setColor(A02);
                break;
        }
        textPaint.setUnderlineText(z);
    }
}
