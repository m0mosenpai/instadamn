package X;

import android.os.CountDownTimer;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Gsf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CountDownTimerC38296Gsf extends CountDownTimer {
    public final /* synthetic */ C75113Zb A00;
    public final /* synthetic */ C81063jb A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC38296Gsf(C75113Zb c75113Zb, C81063jb c81063jb, String str, long j) {
        super(j, 1000L);
        this.A01 = c81063jb;
        this.A00 = c75113Zb;
        this.A02 = str;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        String str;
        int i;
        C81063jb c81063jb = this.A01;
        C75113Zb c75113Zb = this.A00;
        int i2 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C674832n c674832n = c81063jb.A0J;
        UserSession userSession = c674832n.A02;
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        String A00 = AbstractC111324zv.A00(2235);
        if (A0x.getBoolean(A00, true)) {
            UserSession userSession2 = c81063jb.A0K.A00;
            C06090Tz c06090Tz = C06090Tz.A06;
            if (C18U.A06(c06090Tz, userSession2, 36324776103260625L)) {
                str = "delayed_skip_tombstone_display_count";
                i = 0;
                if (AbstractC166987dD.A0x(userSession).getInt("delayed_skip_tombstone_display_count", 0) < c674832n.A00) {
                    if (c75113Zb != null) {
                        c75113Zb.A3B = true;
                    }
                    InterfaceC19630xq A0x2 = AbstractC166987dD.A0x(userSession);
                    AbstractC167017dG.A1L(A0x2.ARD(), A0x2, str, i);
                }
            }
            if (C18U.A06(c06090Tz, userSession2, 36324776102801871L)) {
                InterfaceC19630xq A0x3 = AbstractC166987dD.A0x(userSession);
                if (A0x3.getBoolean(A00, true)) {
                    str = "delayed_skip_tombstone_display_count";
                    i = 0;
                    if (A0x3.getInt("delayed_skip_tombstone_display_count", 0) < c674832n.A00) {
                        if (c75113Zb != null) {
                            c75113Zb.A3C = true;
                        }
                        InterfaceC19630xq A0x22 = AbstractC166987dD.A0x(userSession);
                        AbstractC167017dG.A1L(A0x22.ARD(), A0x22, str, i);
                    }
                }
            }
        }
        if (C18U.A06(C06090Tz.A06, c81063jb.A0K.A00, 36324776103326162L) && (AbstractC166987dD.A0x(userSession).getInt("delayed_skip_tombstone_display_count", 0) >= c674832n.A00 || !AbstractC166987dD.A0x(userSession).getBoolean(A00, true))) {
            if (c75113Zb != null) {
                c75113Zb.A39 = true;
            }
            InterfaceC19630xq A0x4 = AbstractC166987dD.A0x(userSession);
            AbstractC167017dG.A1L(A0x4.ARD(), A0x4, "delayed_skip_tombstone_display_count", 0);
        }
        if (c75113Zb != null) {
            c75113Zb.A0c = AbstractC166987dD.A0x(userSession).getInt("delayed_skip_tombstone_display_count", 0);
        }
        c81063jb.A03();
        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(A002);
        A0w.E7G(AbstractC111324zv.A00(463), currentTimeMillis);
        A0w.apply();
        C81063jb.A00(c81063jb, C05F.A0u, "unknown");
        if (c75113Zb != null) {
            c75113Zb.A0b = 0L;
        }
        c81063jb.A0M.A00.get(this.A02);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C81063jb c81063jb = this.A01;
        C60662pp c60662pp = c81063jb.A06;
        if (c60662pp != null) {
            int i = c81063jb.A01;
            IgTextView igTextView = c60662pp.A04;
            if (igTextView != null) {
                igTextView.setText(String.valueOf(i));
            }
        }
        C75113Zb c75113Zb = this.A00;
        if (c75113Zb != null) {
            c75113Zb.A0b = c81063jb.A01;
        }
        c81063jb.A0M.A00.get(this.A02);
        c81063jb.A01--;
    }
}
