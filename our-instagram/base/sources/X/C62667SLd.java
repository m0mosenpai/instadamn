package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.SLd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62667SLd {
    public final /* synthetic */ NativeAnimatedModule A02;
    public final Queue A01 = new ConcurrentLinkedQueue();
    public AbstractC62479SDg A00 = null;

    public C62667SLd(NativeAnimatedModule nativeAnimatedModule) {
        this.A02 = nativeAnimatedModule;
    }

    public final void A00(C63347Si4 c63347Si4, long j) {
        Queue queue = this.A01;
        if (queue.isEmpty() && this.A00 == null) {
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        while (true) {
            AbstractC62479SDg abstractC62479SDg = this.A00;
            if (abstractC62479SDg != null) {
                if (abstractC62479SDg.A00 > j) {
                    break;
                }
                A1E.add(abstractC62479SDg);
                this.A00 = null;
            }
            AbstractC62479SDg abstractC62479SDg2 = (AbstractC62479SDg) queue.poll();
            if (abstractC62479SDg2 == null) {
                break;
            }
            if (abstractC62479SDg2.A00 > j) {
                this.A00 = abstractC62479SDg2;
                break;
            }
            A1E.add(abstractC62479SDg2);
        }
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC62479SDg abstractC62479SDg3 = (AbstractC62479SDg) it.next();
            if (abstractC62479SDg3 instanceof C60523R2n) {
                C60523R2n c60523R2n = (C60523R2n) abstractC62479SDg3;
                c63347Si4.A0G(c60523R2n.A01, c60523R2n.A03, c60523R2n.A00);
            } else if (abstractC62479SDg3 instanceof C60522R2m) {
                C60522R2m c60522R2m = (C60522R2m) abstractC62479SDg3;
                c63347Si4.A0H(c60522R2m.A00, c60522R2m.A03, c60522R2m.A02);
            } else if (abstractC62479SDg3 instanceof C60524R2o) {
                C60524R2o c60524R2o = (C60524R2o) abstractC62479SDg3;
                c63347Si4.A0I(c60524R2o.A03, c60524R2o.A04, c60524R2o.A01, c60524R2o.A00);
            } else if (abstractC62479SDg3 instanceof C60525R2p) {
                C60525R2p c60525R2p = (C60525R2p) abstractC62479SDg3;
                switch (c60525R2p.A00) {
                    case 0:
                        c63347Si4.A0D(c60525R2p.A01, (Callback) c60525R2p.A03);
                        break;
                    case 1:
                        NativeAnimatedModule nativeAnimatedModule = (NativeAnimatedModule) c60525R2p.A02;
                        nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
                        int i = 0;
                        while (i < c60525R2p.A01) {
                            ReadableArray readableArray = (ReadableArray) c60525R2p.A03;
                            int i2 = i + 1;
                            int i3 = readableArray.getInt(i);
                            Integer[] numArr = AbstractC61534RpE.A00;
                            if (numArr == null) {
                                numArr = C05F.A00(21);
                                AbstractC61534RpE.A00 = numArr;
                            }
                            switch (MSW.A07(numArr, i3 - 1)) {
                                case 0:
                                    int i4 = i2 + 1;
                                    i = i4 + 1;
                                    c63347Si4.A0E(readableArray.getInt(i2), readableArray.getMap(i4));
                                    break;
                                case 1:
                                    int i5 = i2 + 1;
                                    i = i5 + 1;
                                    c63347Si4.A0F(readableArray.getInt(i2), readableArray.getMap(i5));
                                    break;
                                case 2:
                                    i = i2 + 1;
                                    c63347Si4.A0D(readableArray.getInt(i2), null);
                                    break;
                                case 3:
                                    i = i2 + 1;
                                    int i6 = readableArray.getInt(i2);
                                    C64132Szv c64132Szv = new C64132Szv(c60525R2p, i6);
                                    AbstractC62966SZj A00 = C63347Si4.A00(c63347Si4, i6);
                                    if (A00 != null && (A00 instanceof R2f)) {
                                        ((R2f) A00).A02 = c64132Szv;
                                        break;
                                    } else {
                                        throw TXV.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i6);
                                    }
                                    break;
                                case 4:
                                    i = i2 + 1;
                                    int i7 = readableArray.getInt(i2);
                                    AbstractC62966SZj A002 = C63347Si4.A00(c63347Si4, i7);
                                    if (A002 != null && (A002 instanceof R2f)) {
                                        ((R2f) A002).A02 = null;
                                        break;
                                    } else {
                                        throw TXV.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i7);
                                    }
                                    break;
                                case 5:
                                    int i8 = i2 + 1;
                                    i = i8 + 1;
                                    c63347Si4.A0A(readableArray.getInt(i2), readableArray.getInt(i8));
                                    break;
                                case 6:
                                    int i9 = i2 + 1;
                                    i = i9 + 1;
                                    c63347Si4.A0C(readableArray.getInt(i2), readableArray.getInt(i9));
                                    break;
                                case 7:
                                    if (C62856SUd.A00.lazyAnimationCallbacks()) {
                                        nativeAnimatedModule.enqueueFrameCallback();
                                    }
                                    int i10 = i2 + 1;
                                    int i11 = i10 + 1;
                                    i = i11 + 1;
                                    c63347Si4.A0I(null, readableArray.getMap(i11), readableArray.getInt(i2), readableArray.getInt(i10));
                                    break;
                                case 8:
                                    i = i2 + 1;
                                    c63347Si4.A07(readableArray.getInt(i2));
                                    break;
                                case 9:
                                case 10:
                                    int i12 = i2 + 1;
                                    i = i12 + 1;
                                    c63347Si4.A08(readableArray.getInt(i2), readableArray.getDouble(i12));
                                    break;
                                case 11:
                                    i = i2 + 1;
                                    c63347Si4.A05(readableArray.getInt(i2));
                                    break;
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    i = i2 + 1;
                                    c63347Si4.A04(readableArray.getInt(i2));
                                    break;
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    int i13 = i2 + 1;
                                    i = i13 + 1;
                                    c63347Si4.A09(readableArray.getInt(i2), readableArray.getInt(i13));
                                    break;
                                case 14:
                                    int i14 = i2 + 1;
                                    int i15 = readableArray.getInt(i2);
                                    i = i14 + 1;
                                    int i16 = readableArray.getInt(i14);
                                    nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i16);
                                    c63347Si4.A0B(i15, i16);
                                    break;
                                case Process.SIGTERM /* 15 */:
                                    i = i2 + 1;
                                    c63347Si4.A06(readableArray.getInt(i2));
                                    break;
                                case 16:
                                    i = i2 + 1;
                                    int i17 = readableArray.getInt(i2);
                                    c63347Si4.A05.remove(i17);
                                    c63347Si4.A06.remove(i17);
                                    break;
                                case 17:
                                    int i18 = i2 + 1;
                                    int i19 = i18 + 1;
                                    i = i19 + 1;
                                    c63347Si4.A0H(readableArray.getInt(i2), readableArray.getString(i18), readableArray.getMap(i19));
                                    break;
                                case 18:
                                    int i20 = i2 + 1;
                                    int i21 = readableArray.getInt(i2);
                                    nativeAnimatedModule.decrementInFlightAnimationsForViewTag(i21);
                                    int i22 = i20 + 1;
                                    i = i22 + 1;
                                    c63347Si4.A0G(i21, readableArray.getString(i20), readableArray.getInt(i22));
                                    break;
                                case Process.SIGSTOP /* 19 */:
                                case 20:
                                    i = i2 + 1;
                                    break;
                                default:
                                    throw AbstractC166987dD.A12("Batch animation execution op: unknown op code");
                            }
                        }
                        break;
                    case 2:
                        c63347Si4.A0E(c60525R2p.A01, (ReadableMap) c60525R2p.A03);
                        break;
                    case 3:
                        c63347Si4.A0F(c60525R2p.A01, (ReadableMap) c60525R2p.A03);
                        break;
                    default:
                        int i23 = c60525R2p.A01;
                        InterfaceC65350Tid interfaceC65350Tid = (InterfaceC65350Tid) c60525R2p.A03;
                        AbstractC62966SZj A003 = C63347Si4.A00(c63347Si4, i23);
                        if (A003 != null && (A003 instanceof R2f)) {
                            ((R2f) A003).A02 = interfaceC65350Tid;
                            break;
                        } else {
                            throw TXV.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i23);
                        }
                }
            } else if (abstractC62479SDg3 instanceof C60521R2l) {
                C60521R2l c60521R2l = (C60521R2l) abstractC62479SDg3;
                switch (c60521R2l.A00) {
                    case 0:
                        c63347Si4.A0A(c60521R2l.A02, c60521R2l.A01);
                        break;
                    case 1:
                        c63347Si4.A0C(c60521R2l.A02, c60521R2l.A01);
                        break;
                    case 2:
                        c63347Si4.A09(c60521R2l.A01, c60521R2l.A02);
                        break;
                    default:
                        c63347Si4.A0B(c60521R2l.A01, c60521R2l.A02);
                        break;
                }
            } else if (abstractC62479SDg3 instanceof R2k) {
                R2k r2k = (R2k) abstractC62479SDg3;
                if (r2k.A01 != 0) {
                    int i24 = r2k.A02;
                    double d = r2k.A00;
                    AbstractC62966SZj A004 = C63347Si4.A00(c63347Si4, i24);
                    if (A004 != null && (A004 instanceof R2f)) {
                        ((R2f) A004).A01 = d;
                        c63347Si4.A06.put(i24, A004);
                    } else {
                        throw TXV.A00("setAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i24);
                    }
                } else {
                    c63347Si4.A08(r2k.A02, r2k.A00);
                }
            } else {
                R2j r2j = (R2j) abstractC62479SDg3;
                switch (r2j.A00) {
                    case 0:
                        c63347Si4.A05(r2j.A01);
                        break;
                    case 1:
                        c63347Si4.A04(r2j.A01);
                        break;
                    case 2:
                        c63347Si4.A07(r2j.A01);
                        break;
                    case 3:
                        c63347Si4.A06(r2j.A01);
                        break;
                    case 4:
                        int i25 = r2j.A01;
                        AbstractC62966SZj A005 = C63347Si4.A00(c63347Si4, i25);
                        if (A005 != null && (A005 instanceof R2f)) {
                            ((R2f) A005).A02 = null;
                            break;
                        } else {
                            throw TXV.A00("startListeningToAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i25);
                        }
                    default:
                        int i26 = r2j.A01;
                        c63347Si4.A05.remove(i26);
                        c63347Si4.A06.remove(i26);
                        break;
                }
            }
        }
    }
}
