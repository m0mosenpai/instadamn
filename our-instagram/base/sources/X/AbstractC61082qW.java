package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2qW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC61082qW {
    public static final Map A00;
    public static final Map A01;
    public static final List A02;

    public static final EnumSet A00(QuickPromotionSlot quickPromotionSlot, QuickPromotionSurface quickPromotionSurface) {
        Object obj;
        EnumSet enumSet;
        C14360o3.A0B(quickPromotionSurface, 1);
        Iterator it = A01(quickPromotionSlot).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EnumC61092qX) obj).A00 == quickPromotionSurface) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC61092qX enumC61092qX = (EnumC61092qX) obj;
        if (enumC61092qX == null || (enumSet = enumC61092qX.A01) == null) {
            EnumSet noneOf = EnumSet.noneOf(Trigger.class);
            C14360o3.A07(noneOf);
            return noneOf;
        }
        return enumSet;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00b1. Please report as an issue. */
    static {
        Map map;
        Trigger trigger;
        Trigger trigger2;
        Trigger trigger3;
        EnumC61092qX enumC61092qX;
        Trigger trigger4;
        Trigger trigger5;
        Trigger trigger6;
        Collection of;
        Map map2;
        Trigger trigger7;
        Collection A1Q;
        QuickPromotionSlot[] quickPromotionSlotArr = new QuickPromotionSlot[55];
        System.arraycopy(new QuickPromotionSlot[]{QuickPromotionSlot.A0k, QuickPromotionSlot.A0j, QuickPromotionSlot.A0e, QuickPromotionSlot.A0g, QuickPromotionSlot.A03, QuickPromotionSlot.A05, QuickPromotionSlot.A0B, QuickPromotionSlot.A0C, QuickPromotionSlot.A0H, QuickPromotionSlot.A0J, QuickPromotionSlot.A0K, QuickPromotionSlot.A0M, QuickPromotionSlot.A0O, QuickPromotionSlot.A0R, QuickPromotionSlot.A0S, QuickPromotionSlot.A0U, QuickPromotionSlot.A0W, QuickPromotionSlot.A0V, QuickPromotionSlot.A0b, QuickPromotionSlot.A0x, QuickPromotionSlot.A0y, QuickPromotionSlot.A0s, QuickPromotionSlot.A0d, QuickPromotionSlot.A0v, QuickPromotionSlot.A0w, QuickPromotionSlot.A1A, QuickPromotionSlot.A02}, 0, quickPromotionSlotArr, 0, 27);
        System.arraycopy(new QuickPromotionSlot[]{QuickPromotionSlot.A18, QuickPromotionSlot.A0Q, QuickPromotionSlot.A0G, QuickPromotionSlot.A0E, QuickPromotionSlot.A0F, QuickPromotionSlot.A1B, QuickPromotionSlot.A0L, QuickPromotionSlot.A0Y, QuickPromotionSlot.A0X, QuickPromotionSlot.A0u, QuickPromotionSlot.A17, QuickPromotionSlot.A07, QuickPromotionSlot.A0p, QuickPromotionSlot.A0q, QuickPromotionSlot.A14, QuickPromotionSlot.A15, QuickPromotionSlot.A0h, QuickPromotionSlot.A0i, QuickPromotionSlot.A0n, QuickPromotionSlot.A0Z, QuickPromotionSlot.A08, QuickPromotionSlot.A0A, QuickPromotionSlot.A09, QuickPromotionSlot.A0f, QuickPromotionSlot.A0l, QuickPromotionSlot.A04, QuickPromotionSlot.A0T}, 0, quickPromotionSlotArr, 27, 27);
        System.arraycopy(new QuickPromotionSlot[]{QuickPromotionSlot.A0N}, 0, quickPromotionSlotArr, 54, 1);
        A02 = AbstractC16960so.A1Q(quickPromotionSlotArr);
        A01 = new EnumMap(QuickPromotionSlot.class);
        A00 = new EnumMap(QuickPromotionSlot.class);
        for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
            switch (quickPromotionSlot.ordinal()) {
                case 0:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1I, EnumC61092qX.A1M, EnumC61092qX.A1H, EnumC61092qX.A1G, EnumC61092qX.A1F));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A1e, Trigger.A1j, Trigger.A1k, Trigger.A1c, Trigger.A1B, Trigger.A1C);
                    map2.put(quickPromotionSlot, A1Q);
                case 1:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1K, EnumC61092qX.A1L, EnumC61092qX.A1J));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A1f, Trigger.A1g, Trigger.A1h, Trigger.A1i);
                    map2.put(quickPromotionSlot, A1Q);
                case 2:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0f, EnumC61092qX.A0k, EnumC61092qX.A0n, EnumC61092qX.A0j, EnumC61092qX.A0g));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A0X, Trigger.A0Z, Trigger.A0c, Trigger.A1Z, Trigger.A0T, Trigger.A0Y, Trigger.A0U);
                    map2.put(quickPromotionSlot, A1Q);
                case 3:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0l, EnumC61092qX.A0m));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A0a, Trigger.A0b);
                    map2.put(quickPromotionSlot, A1Q);
                case 4:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A05, EnumC61092qX.A1T));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A05, Trigger.A1r);
                    map2.put(quickPromotionSlot, A1Q);
                case 5:
                    Map map3 = A01;
                    List singletonList = Collections.singletonList(EnumC61092qX.A1E);
                    C14360o3.A07(singletonList);
                    map3.put(quickPromotionSlot, singletonList);
                    map = A00;
                    trigger = Trigger.A1b;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 6:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A08, EnumC61092qX.A09, EnumC61092qX.A0A, EnumC61092qX.A07));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A07, Trigger.A08, Trigger.A09);
                    map2.put(quickPromotionSlot, A1Q);
                case 7:
                    Map map4 = A01;
                    List singletonList2 = Collections.singletonList(EnumC61092qX.A0I);
                    C14360o3.A07(singletonList2);
                    map4.put(quickPromotionSlot, singletonList2);
                    map2 = A00;
                    trigger7 = Trigger.A0E;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 8:
                    Map map5 = A01;
                    List singletonList3 = Collections.singletonList(EnumC61092qX.A0J);
                    C14360o3.A07(singletonList3);
                    map5.put(quickPromotionSlot, singletonList3);
                    map2 = A00;
                    trigger7 = Trigger.A0F;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 9:
                    Map map6 = A01;
                    List singletonList4 = Collections.singletonList(EnumC61092qX.A0K);
                    C14360o3.A07(singletonList4);
                    map6.put(quickPromotionSlot, singletonList4);
                    map2 = A00;
                    trigger7 = Trigger.A0G;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 10:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0n, EnumC61092qX.A0i, EnumC61092qX.A0h));
                    map2 = A00;
                    trigger7 = Trigger.A0V;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 11:
                case 32:
                    map2 = A01;
                    A1Q = Collections.singletonList(EnumC61092qX.A0n);
                    C14360o3.A07(A1Q);
                    map2.put(quickPromotionSlot, A1Q);
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0w, EnumC61092qX.A0x, EnumC61092qX.A0z, EnumC61092qX.A0u));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A0l, Trigger.A0o, Trigger.A0q, Trigger.A0k, Trigger.A0n, Trigger.A0m);
                    map2.put(quickPromotionSlot, A1Q);
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    Map map7 = A01;
                    List singletonList5 = Collections.singletonList(EnumC61092qX.A0y);
                    C14360o3.A07(singletonList5);
                    map7.put(quickPromotionSlot, singletonList5);
                    map2 = A00;
                    trigger7 = Trigger.A0p;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 14:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0R, EnumC61092qX.A0S, EnumC61092qX.A0U, EnumC61092qX.A0P, EnumC61092qX.A0Q));
                    map2 = A00;
                    A1Q = EnumSet.of(Trigger.A0N, Trigger.A1L);
                    map2.put(quickPromotionSlot, A1Q);
                case Process.SIGTERM /* 15 */:
                    map2 = A01;
                    A1Q = AbstractC16960so.A1Q(EnumC61092qX.A0X, EnumC61092qX.A0W);
                    map2.put(quickPromotionSlot, A1Q);
                case 16:
                    Map map8 = A01;
                    List singletonList6 = Collections.singletonList(EnumC61092qX.A0T);
                    C14360o3.A07(singletonList6);
                    map8.put(quickPromotionSlot, singletonList6);
                    map2 = A00;
                    trigger7 = Trigger.A1M;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 17:
                    Map map9 = A01;
                    List singletonList7 = Collections.singletonList(EnumC61092qX.A0Y);
                    C14360o3.A07(singletonList7);
                    map9.put(quickPromotionSlot, singletonList7);
                    map2 = A00;
                    trigger7 = Trigger.A1H;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 18:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0b, EnumC61092qX.A0c, EnumC61092qX.A0d, EnumC61092qX.A0a));
                    A00.put(quickPromotionSlot, EnumSet.of(Trigger.A0P, Trigger.A0Q, Trigger.A0x, Trigger.A19, Trigger.A0w));
                case Process.SIGSTOP /* 19 */:
                    Map map10 = A01;
                    List singletonList8 = Collections.singletonList(EnumC61092qX.A0e);
                    C14360o3.A07(singletonList8);
                    map10.put(quickPromotionSlot, singletonList8);
                    map = A00;
                    trigger = Trigger.A0v;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 20:
                    Map map11 = A01;
                    List singletonList9 = Collections.singletonList(EnumC61092qX.A0r);
                    C14360o3.A07(singletonList9);
                    map11.put(quickPromotionSlot, singletonList9);
                    map = A00;
                    trigger = Trigger.A0f;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 21:
                    Map map12 = A01;
                    List singletonList10 = Collections.singletonList(EnumC61092qX.A0t);
                    C14360o3.A07(singletonList10);
                    map12.put(quickPromotionSlot, singletonList10);
                    map = A00;
                    trigger = Trigger.A0i;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 22:
                    Map map13 = A01;
                    List singletonList11 = Collections.singletonList(EnumC61092qX.A0s);
                    C14360o3.A07(singletonList11);
                    map13.put(quickPromotionSlot, singletonList11);
                    map = A00;
                    trigger = Trigger.A0h;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 23:
                    Map map14 = A01;
                    List singletonList12 = Collections.singletonList(EnumC61092qX.A1Z);
                    C14360o3.A07(singletonList12);
                    map14.put(quickPromotionSlot, singletonList12);
                    map = A00;
                    trigger = Trigger.A20;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 24:
                    Map map15 = A01;
                    List singletonList13 = Collections.singletonList(EnumC61092qX.A1Y);
                    C14360o3.A07(singletonList13);
                    map15.put(quickPromotionSlot, singletonList13);
                    map = A00;
                    trigger = Trigger.A1w;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 25:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1a, EnumC61092qX.A1b));
                    map = A00;
                    trigger = Trigger.A1z;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 26:
                    Map map16 = A01;
                    List singletonList14 = Collections.singletonList(EnumC61092qX.A1R);
                    C14360o3.A07(singletonList14);
                    map16.put(quickPromotionSlot, singletonList14);
                    map = A00;
                    trigger = Trigger.A1n;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 27:
                    Map map17 = A01;
                    List singletonList15 = Collections.singletonList(EnumC61092qX.A18);
                    C14360o3.A07(singletonList15);
                    map17.put(quickPromotionSlot, singletonList15);
                    map = A00;
                    trigger = Trigger.A1W;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 28:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1W, EnumC61092qX.A1V));
                    map = A00;
                    trigger2 = Trigger.A1t;
                    trigger3 = Trigger.A0W;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                    Map map18 = A01;
                    List singletonList16 = Collections.singletonList(EnumC61092qX.A1W);
                    C14360o3.A07(singletonList16);
                    map18.put(quickPromotionSlot, singletonList16);
                    map = A00;
                    trigger = Trigger.A1t;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 30:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1d, EnumC61092qX.A1X));
                    map = A00;
                    trigger2 = Trigger.A1y;
                    trigger3 = Trigger.A1D;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case 31:
                    map = A01;
                    enumC61092qX = EnumC61092qX.A1e;
                    of = Collections.singletonList(enumC61092qX);
                    C14360o3.A07(of);
                    map.put(quickPromotionSlot, of);
                case 33:
                    map = A01;
                    enumC61092qX = EnumC61092qX.A1l;
                    of = Collections.singletonList(enumC61092qX);
                    C14360o3.A07(of);
                    map.put(quickPromotionSlot, of);
                case 34:
                    Map map19 = A01;
                    List singletonList17 = Collections.singletonList(EnumC61092qX.A04);
                    C14360o3.A07(singletonList17);
                    map19.put(quickPromotionSlot, singletonList17);
                    map = A00;
                    trigger = Trigger.A04;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 35:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A1j, EnumC61092qX.A0E));
                    map = A00;
                    trigger2 = Trigger.A25;
                    trigger3 = Trigger.A24;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case 36:
                    Map map20 = A01;
                    List singletonList18 = Collections.singletonList(EnumC61092qX.A1O);
                    C14360o3.A07(singletonList18);
                    map20.put(quickPromotionSlot, singletonList18);
                    map = A00;
                    trigger = Trigger.A1l;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 37:
                    Map map21 = A01;
                    List singletonList19 = Collections.singletonList(EnumC61092qX.A0Z);
                    C14360o3.A07(singletonList19);
                    map21.put(quickPromotionSlot, singletonList19);
                    map = A00;
                    trigger = Trigger.A0O;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 38:
                    Map map22 = A01;
                    List singletonList20 = Collections.singletonList(EnumC61092qX.A0O);
                    C14360o3.A07(singletonList20);
                    map22.put(quickPromotionSlot, singletonList20);
                    map = A00;
                    trigger = Trigger.A0K;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 39:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A16, EnumC61092qX.A15));
                    map = A00;
                    trigger2 = Trigger.A1R;
                    trigger3 = Trigger.A1S;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case 40:
                    Map map23 = A01;
                    List singletonList21 = Collections.singletonList(EnumC61092qX.A17);
                    C14360o3.A07(singletonList21);
                    map23.put(quickPromotionSlot, singletonList21);
                    map = A00;
                    trigger4 = Trigger.A1U;
                    trigger5 = Trigger.A1V;
                    trigger6 = Trigger.A1P;
                    of = EnumSet.of(trigger4, trigger5, trigger6);
                    map.put(quickPromotionSlot, of);
                case Seq.NULL_REFNUM /* 41 */:
                    Map map24 = A01;
                    List singletonList22 = Collections.singletonList(EnumC61092qX.A14);
                    C14360o3.A07(singletonList22);
                    map24.put(quickPromotionSlot, singletonList22);
                    map = A00;
                    trigger2 = Trigger.A1Q;
                    trigger3 = Trigger.A1T;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case Seq.RefTracker.REF_OFFSET /* 42 */:
                    Map map25 = A01;
                    List singletonList23 = Collections.singletonList(EnumC61092qX.A0L);
                    C14360o3.A07(singletonList23);
                    map25.put(quickPromotionSlot, singletonList23);
                    map2 = A00;
                    trigger7 = Trigger.A0I;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 43:
                    map2 = A01;
                    A1Q = AbstractC16960so.A1Q(EnumC61092qX.A0M, EnumC61092qX.A0N, EnumC61092qX.A13);
                    map2.put(quickPromotionSlot, A1Q);
                case 44:
                    Map map26 = A01;
                    List singletonList24 = Collections.singletonList(EnumC61092qX.A1m);
                    C14360o3.A07(singletonList24);
                    map26.put(quickPromotionSlot, singletonList24);
                    map = A00;
                    trigger = Trigger.A28;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 45:
                    map = A01;
                    enumC61092qX = EnumC61092qX.A1n;
                    of = Collections.singletonList(enumC61092qX);
                    C14360o3.A07(of);
                    map.put(quickPromotionSlot, of);
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                    Map map27 = A01;
                    List singletonList25 = Collections.singletonList(EnumC61092qX.A0V);
                    C14360o3.A07(singletonList25);
                    map27.put(quickPromotionSlot, singletonList25);
                    map = A00;
                    trigger = Trigger.A0M;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 47:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A11, EnumC61092qX.A12, EnumC61092qX.A1A));
                    map = A00;
                    trigger2 = Trigger.A11;
                    trigger3 = Trigger.A12;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case 48:
                    Map map28 = A01;
                    List singletonList26 = Collections.singletonList(EnumC61092qX.A10);
                    C14360o3.A07(singletonList26);
                    map28.put(quickPromotionSlot, singletonList26);
                    map = A00;
                    trigger = Trigger.A0y;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 49:
                    Map map29 = A01;
                    List singletonList27 = Collections.singletonList(EnumC61092qX.A1c);
                    C14360o3.A07(singletonList27);
                    map29.put(quickPromotionSlot, singletonList27);
                    map = A00;
                    trigger = Trigger.A1x;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                    Map map30 = A01;
                    List singletonList28 = Collections.singletonList(EnumC61092qX.A1h);
                    C14360o3.A07(singletonList28);
                    map30.put(quickPromotionSlot, singletonList28);
                    map2 = A00;
                    trigger7 = Trigger.A23;
                    A1Q = EnumSet.of(trigger7);
                    map2.put(quickPromotionSlot, A1Q);
                case 51:
                    Map map31 = A01;
                    List singletonList29 = Collections.singletonList(EnumC61092qX.A1U);
                    C14360o3.A07(singletonList29);
                    map31.put(quickPromotionSlot, singletonList29);
                    map = A00;
                    trigger = Trigger.A1s;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 52:
                    Map map32 = A01;
                    List singletonList30 = Collections.singletonList(EnumC61092qX.A1k);
                    C14360o3.A07(singletonList30);
                    map32.put(quickPromotionSlot, singletonList30);
                    map = A00;
                    trigger = Trigger.A26;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 53:
                    Map map33 = A01;
                    List singletonList31 = Collections.singletonList(EnumC61092qX.A1i);
                    C14360o3.A07(singletonList31);
                    map33.put(quickPromotionSlot, singletonList31);
                    map = A00;
                    trigger = Trigger.A1I;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 54:
                    Map map34 = A01;
                    List singletonList32 = Collections.singletonList(EnumC61092qX.A0C);
                    C14360o3.A07(singletonList32);
                    map34.put(quickPromotionSlot, singletonList32);
                    map = A00;
                    trigger = Trigger.A0B;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 55:
                    Map map35 = A01;
                    List singletonList33 = Collections.singletonList(EnumC61092qX.A1Q);
                    C14360o3.A07(singletonList33);
                    map35.put(quickPromotionSlot, singletonList33);
                    map = A00;
                    trigger = Trigger.A15;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 56:
                    Map map36 = A01;
                    List singletonList34 = Collections.singletonList(EnumC61092qX.A1P);
                    C14360o3.A07(singletonList34);
                    map36.put(quickPromotionSlot, singletonList34);
                    map = A00;
                    trigger = Trigger.A14;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 57:
                    Map map37 = A01;
                    List singletonList35 = Collections.singletonList(EnumC61092qX.A1g);
                    C14360o3.A07(singletonList35);
                    map37.put(quickPromotionSlot, singletonList35);
                    map = A00;
                    trigger = Trigger.A1J;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 58:
                    Map map38 = A01;
                    List singletonList36 = Collections.singletonList(EnumC61092qX.A1f);
                    C14360o3.A07(singletonList36);
                    map38.put(quickPromotionSlot, singletonList36);
                    map = A00;
                    trigger4 = Trigger.A1E;
                    trigger5 = Trigger.A1G;
                    trigger6 = Trigger.A1K;
                    of = EnumSet.of(trigger4, trigger5, trigger6);
                    map.put(quickPromotionSlot, of);
                case 59:
                    Map map39 = A01;
                    List singletonList37 = Collections.singletonList(EnumC61092qX.A1B);
                    C14360o3.A07(singletonList37);
                    map39.put(quickPromotionSlot, singletonList37);
                    map = A00;
                    trigger = Trigger.A0z;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 60:
                    Map map40 = A01;
                    List singletonList38 = Collections.singletonList(EnumC61092qX.A1C);
                    C14360o3.A07(singletonList38);
                    map40.put(quickPromotionSlot, singletonList38);
                    map = A00;
                    trigger = Trigger.A10;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 61:
                    Map map41 = A01;
                    List singletonList39 = Collections.singletonList(EnumC61092qX.A1N);
                    C14360o3.A07(singletonList39);
                    map41.put(quickPromotionSlot, singletonList39);
                    map = A00;
                    trigger2 = Trigger.A0r;
                    trigger3 = Trigger.A0s;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case 62:
                    Map map42 = A01;
                    List singletonList40 = Collections.singletonList(EnumC61092qX.A19);
                    C14360o3.A07(singletonList40);
                    map42.put(quickPromotionSlot, singletonList40);
                    map = A00;
                    trigger2 = Trigger.A0A;
                    trigger3 = Trigger.A1q;
                    of = EnumSet.of(trigger2, trigger3);
                    map.put(quickPromotionSlot, of);
                case StringTreeSet.PAYLOAD_MASK /* 63 */:
                    Map map43 = A01;
                    List singletonList41 = Collections.singletonList(EnumC61092qX.A1D);
                    C14360o3.A07(singletonList41);
                    map43.put(quickPromotionSlot, singletonList41);
                    map = A00;
                    trigger = Trigger.A0g;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 64:
                    map = A01;
                    enumC61092qX = EnumC61092qX.A0D;
                    of = Collections.singletonList(enumC61092qX);
                    C14360o3.A07(of);
                    map.put(quickPromotionSlot, of);
                case 65:
                    Map map44 = A01;
                    List singletonList42 = Collections.singletonList(EnumC61092qX.A06);
                    C14360o3.A07(singletonList42);
                    map44.put(quickPromotionSlot, singletonList42);
                    map = A00;
                    trigger = Trigger.A06;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 66:
                    A01.put(quickPromotionSlot, AbstractC16960so.A1Q(EnumC61092qX.A0q, EnumC61092qX.A0p, EnumC61092qX.A0o));
                    map = A00;
                    trigger = Trigger.A0e;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 67:
                    Map map45 = A01;
                    List singletonList43 = Collections.singletonList(EnumC61092qX.A0B);
                    C14360o3.A07(singletonList43);
                    map45.put(quickPromotionSlot, singletonList43);
                    map = A00;
                    trigger = Trigger.A1F;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 68:
                    Map map46 = A01;
                    List singletonList44 = Collections.singletonList(EnumC61092qX.A1S);
                    C14360o3.A07(singletonList44);
                    map46.put(quickPromotionSlot, singletonList44);
                    map = A00;
                    trigger = Trigger.A18;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 69:
                    Map map47 = A01;
                    List singletonList45 = Collections.singletonList(EnumC61092qX.A0F);
                    C14360o3.A07(singletonList45);
                    map47.put(quickPromotionSlot, singletonList45);
                    map = A00;
                    trigger = Trigger.A0C;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 70:
                    Map map48 = A01;
                    List singletonList46 = Collections.singletonList(EnumC61092qX.A0H);
                    C14360o3.A07(singletonList46);
                    map48.put(quickPromotionSlot, singletonList46);
                    map = A00;
                    trigger = Trigger.A0D;
                    of = EnumSet.of(trigger);
                    map.put(quickPromotionSlot, of);
                case 71:
                    map = A01;
                    enumC61092qX = EnumC61092qX.A0G;
                    of = Collections.singletonList(enumC61092qX);
                    C14360o3.A07(of);
                    map.put(quickPromotionSlot, of);
                default:
                    throw new RuntimeException();
            }
        }
    }

    public static final List A01(QuickPromotionSlot quickPromotionSlot) {
        List list = (List) A01.get(quickPromotionSlot);
        if (list != null && (!list.isEmpty())) {
            return new ArrayList(list);
        }
        return C16930sl.A00;
    }
}
