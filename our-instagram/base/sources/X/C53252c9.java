package X;

import android.content.Context;
import android.os.Handler;

/* renamed from: X.2c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53252c9 {
    public static C53252c9 A05;
    public C99614de A00;
    public C65714Tsn A01;
    public boolean A02;
    public C61556Rpc A03;
    public final C53262cA A04 = new Object() { // from class: X.2cA
    };

    /* JADX WARN: Type inference failed for: r1v0, types: [X.4dd] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Rpc, java.lang.Object] */
    public static void A00(Context context, final AbstractC12990ll abstractC12990ll, final C53252c9 c53252c9) {
        C006802i c006802i = C006802i.A0p;
        c53252c9.A00 = new C99614de(context, c006802i, new Object() { // from class: X.4dd
        });
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, abstractC12990ll, 36320914924643315L)) {
            C65714Tsn c65714Tsn = new C65714Tsn(new Handler(), c006802i, c53252c9.A04);
            c53252c9.A01 = c65714Tsn;
            c65714Tsn.A01 = true;
            if (C18U.A06(c06090Tz, abstractC12990ll, 36320914925167607L)) {
                ?? obj = new Object();
                obj.A00 = new C62572SGx(c006802i, Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, 36602389901939342L)).intValue(), Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, 36602389901808269L)).intValue(), Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, 36602389901480586L)).intValue(), Long.valueOf(C18U.A01(c06090Tz, abstractC12990ll, 36602389901611659L)).intValue(), C18U.A06(c06090Tz, abstractC12990ll, 36320914924839925L));
                c53252c9.A03 = obj;
            }
        }
        c53252c9.A02 = true;
    }

    public final void A01() {
        C62572SGx c62572SGx;
        C99614de c99614de = this.A00;
        if (c99614de != null) {
            c99614de.A02 = false;
        }
        C65714Tsn c65714Tsn = this.A01;
        if (c65714Tsn != null) {
            c65714Tsn.A01 = false;
        }
        C61556Rpc c61556Rpc = this.A03;
        if (c61556Rpc != null && (c62572SGx = c61556Rpc.A00) != null) {
            HandlerC58464Pvp handlerC58464Pvp = c62572SGx.A02;
            handlerC58464Pvp.sendMessage(handlerC58464Pvp.obtainMessage(2));
        }
    }

    public final void A02() {
        C62572SGx c62572SGx;
        C99614de c99614de = this.A00;
        if (c99614de != null) {
            c99614de.A02 = true;
        }
        C65714Tsn c65714Tsn = this.A01;
        if (c65714Tsn != null) {
            c65714Tsn.A01 = true;
        }
        C61556Rpc c61556Rpc = this.A03;
        if (c61556Rpc != null && (c62572SGx = c61556Rpc.A00) != null) {
            long j = c62572SGx.A00;
            if (j >= 0) {
                HandlerC58464Pvp handlerC58464Pvp = c62572SGx.A02;
                handlerC58464Pvp.sendMessageDelayed(handlerC58464Pvp.obtainMessage(0, Long.valueOf(j)), j);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2cA] */
    public C53252c9(Context context, AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll != null) {
            A00(context, abstractC12990ll, this);
        }
    }
}
