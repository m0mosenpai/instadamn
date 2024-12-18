package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.animated.EventAnimationDriver;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.UIManagerHelper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.Si4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63347Si4 {
    public final R3M A07;
    public final SparseArray A05 = AbstractC58318PtA.A0G();
    public final SparseArray A04 = AbstractC58318PtA.A0G();
    public final SparseArray A06 = AbstractC58318PtA.A0G();
    public final List A08 = AbstractC166987dD.A1E();
    public int A02 = 0;
    public final List A09 = AbstractC58318PtA.A11();
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A03 = false;

    private void A01(AbstractC62966SZj abstractC62966SZj) {
        WritableNativeArray writableNativeArray = null;
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            if (i >= sparseArray.size()) {
                break;
            }
            SMC smc = (SMC) sparseArray.valueAt(i);
            if (abstractC62966SZj.equals(smc.A01)) {
                if (smc.A02 != null) {
                    WritableNativeMap A0c = AbstractC58321PtD.A0c();
                    R2f.A00(smc, A0c, false);
                    AbstractC58321PtD.A1K(smc.A02, A0c);
                } else {
                    WritableNativeMap A0c2 = AbstractC58321PtD.A0c();
                    A0c2.putInt("animationId", smc.A00);
                    R2f.A00(smc, A0c2, false);
                    if (writableNativeArray == null) {
                        writableNativeArray = new WritableNativeArray();
                    }
                    writableNativeArray.pushMap(A0c2);
                }
                sparseArray.removeAt(i);
                i--;
            }
            i++;
        }
        if (writableNativeArray != null) {
            this.A07.A0E("onNativeAnimatedModuleAnimationFinished", writableNativeArray);
        }
    }

    public final void A07(int i) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.A04;
            WritableNativeArray writableNativeArray = null;
            if (i2 < sparseArray.size()) {
                SMC smc = (SMC) sparseArray.valueAt(i2);
                if (smc.A00 == i) {
                    Callback callback = smc.A02;
                    WritableNativeMap A0c = AbstractC58321PtD.A0c();
                    if (callback != null) {
                        R2f.A00(smc, A0c, false);
                        AbstractC58321PtD.A1K(smc.A02, A0c);
                    } else {
                        A0c.putInt("animationId", smc.A00);
                        R2f.A00(smc, A0c, false);
                        writableNativeArray = new WritableNativeArray();
                        writableNativeArray.pushMap(A0c);
                    }
                    sparseArray.removeAt(i2);
                    if (writableNativeArray != null) {
                        this.A07.A0E("onNativeAnimatedModuleAnimationFinished", writableNativeArray);
                        return;
                    }
                    return;
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public static AbstractC62966SZj A00(C63347Si4 c63347Si4, int i) {
        return (AbstractC62966SZj) c63347Si4.A05.get(i);
    }

    public static void A02(C63347Si4 c63347Si4, Sb5 sb5) {
        InterfaceC65363Tiv interfaceC65363Tiv;
        List<EventAnimationDriver> list = c63347Si4.A08;
        if (!list.isEmpty()) {
            boolean z = false;
            if (sb5 instanceof R6E) {
                R6E r6e = (R6E) sb5;
                interfaceC65363Tiv = r6e.A01;
                if (interfaceC65363Tiv == null) {
                    interfaceC65363Tiv = new C64142T0p(r6e);
                    r6e.A01 = interfaceC65363Tiv;
                }
            } else {
                interfaceC65363Tiv = sb5.A04;
                if (interfaceC65363Tiv == null) {
                    interfaceC65363Tiv = new T0o(sb5);
                    sb5.A04 = interfaceC65363Tiv;
                }
            }
            for (EventAnimationDriver eventAnimationDriver : list) {
                if (interfaceC65363Tiv.Cnd(eventAnimationDriver.viewTag, eventAnimationDriver.eventName)) {
                    z = true;
                    c63347Si4.A01(eventAnimationDriver.valueNode);
                    sb5.A0A(eventAnimationDriver);
                    c63347Si4.A09.add(eventAnimationDriver.valueNode);
                }
            }
            if (z) {
                List list2 = c63347Si4.A09;
                A03(c63347Si4, list2);
                list2.clear();
            }
        }
    }

    public static void A03(C63347Si4 c63347Si4, List list) {
        String str;
        String str2;
        String str3;
        R2f r2f;
        InterfaceC65350Tid interfaceC65350Tid;
        IllegalArgumentException A12;
        double d;
        Object obj;
        int A0H;
        Object obj2;
        T0G t0g;
        int A0H2;
        int i = c63347Si4.A02 + 1;
        c63347Si4.A02 = i;
        if (i == 0) {
            c63347Si4.A02 = 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            AbstractC62966SZj abstractC62966SZj = (AbstractC62966SZj) it.next();
            int i3 = abstractC62966SZj.A00;
            int i4 = c63347Si4.A02;
            if (i3 != i4) {
                abstractC62966SZj.A00 = i4;
                i2++;
                arrayDeque.add(abstractC62966SZj);
            }
        }
        while (!arrayDeque.isEmpty()) {
            AbstractC62966SZj abstractC62966SZj2 = (AbstractC62966SZj) arrayDeque.poll();
            if (abstractC62966SZj2.A03 != null) {
                for (int i5 = 0; i5 < abstractC62966SZj2.A03.size(); i5++) {
                    AbstractC62966SZj abstractC62966SZj3 = (AbstractC62966SZj) abstractC62966SZj2.A03.get(i5);
                    abstractC62966SZj3.A01++;
                    int i6 = abstractC62966SZj3.A00;
                    int i7 = c63347Si4.A02;
                    if (i6 != i7) {
                        abstractC62966SZj3.A00 = i7;
                        i2++;
                        arrayDeque.add(abstractC62966SZj3);
                    }
                }
            }
        }
        int i8 = c63347Si4.A02 + 1;
        c63347Si4.A02 = i8;
        if (i8 == 0) {
            c63347Si4.A02 = 1;
        }
        Iterator it2 = list.iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            AbstractC62966SZj abstractC62966SZj4 = (AbstractC62966SZj) it2.next();
            if (abstractC62966SZj4.A01 == 0) {
                int i10 = abstractC62966SZj4.A00;
                int i11 = c63347Si4.A02;
                if (i10 != i11) {
                    abstractC62966SZj4.A00 = i11;
                    i9++;
                    arrayDeque.add(abstractC62966SZj4);
                }
            }
        }
        int i12 = 0;
        while (!arrayDeque.isEmpty()) {
            AbstractC62966SZj abstractC62966SZj5 = (AbstractC62966SZj) arrayDeque.poll();
            try {
                abstractC62966SZj5.A04();
            } catch (TXV e) {
                C0I2.A05("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
            }
            if (abstractC62966SZj5 instanceof C60519R2b) {
                C60519R2b c60519R2b = (C60519R2b) abstractC62966SZj5;
                if (c60519R2b.A00 != -1) {
                    Iterator A15 = AbstractC166997dE.A15(c60519R2b.A04);
                    while (A15.hasNext()) {
                        Map.Entry A1K = AbstractC166987dD.A1K(A15);
                        String A17 = AbstractC31172DnG.A17(A1K);
                        AbstractC62966SZj A00 = A00(c60519R2b.A02, AbstractC43593JPy.A04(A1K));
                        if (A00 != null) {
                            if (A00 instanceof R2Z) {
                                R2Z r2z = (R2Z) A00;
                                T0G t0g2 = c60519R2b.A03;
                                C14360o3.A0B(t0g2, 0);
                                Iterator A152 = AbstractC166997dE.A15(r2z.A01);
                                while (A152.hasNext()) {
                                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                                    String A172 = AbstractC31172DnG.A17(A1K2);
                                    AbstractC62966SZj A002 = A00(r2z.A00, AbstractC43593JPy.A04(A1K2));
                                    if (A002 != null) {
                                        if (A002 instanceof C60518R2a) {
                                            C60518R2a c60518R2a = (C60518R2a) A002;
                                            List list2 = c60518R2a.A01;
                                            int size = list2.size();
                                            ArrayList A173 = AbstractC25225BEi.A17(size);
                                            for (int i13 = 0; i13 < size; i13++) {
                                                C62480SDh c62480SDh = (C62480SDh) list2.get(i13);
                                                if (c62480SDh instanceof C60526R2q) {
                                                    AbstractC62966SZj A003 = A00(c60518R2a.A00, ((C60526R2q) c62480SDh).A00);
                                                    if (A003 != null) {
                                                        if (A003 instanceof R2f) {
                                                            d = ((R2f) A003).A05();
                                                        } else {
                                                            StringBuilder A1C = AbstractC166987dD.A1C();
                                                            A12 = AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(A003, "Unsupported type of node used as a transform child node ", A1C), A1C);
                                                        }
                                                    } else {
                                                        A12 = AbstractC166987dD.A12("Mapped style node does not exist");
                                                    }
                                                } else {
                                                    C14360o3.A0C(c62480SDh, "null cannot be cast to non-null type com.facebook.react.animated.TransformAnimatedNode.StaticTransformConfig");
                                                    d = ((C60527R2r) c62480SDh).A00;
                                                }
                                                A173.add(new T0G(c62480SDh.A00, Double.valueOf(d)));
                                            }
                                            t0g2.putArray("transform", new T0F(A173));
                                        } else if (A002 instanceof R2f) {
                                            R2f r2f2 = (R2f) A002;
                                            if (r2f2 instanceof R2y) {
                                                obj = ((R2y) r2f2).A02;
                                            } else {
                                                obj = null;
                                            }
                                            if (obj instanceof Integer) {
                                                A0H = AbstractC166987dD.A0H(obj);
                                                t0g2.A01(A172, A0H);
                                            } else if (obj instanceof String) {
                                                t0g2.putString(A172, (String) obj);
                                            } else {
                                                t0g2.putDouble(A172, r2f2.A05());
                                            }
                                        } else if (A002 instanceof R2d) {
                                            A0H = ((R2d) A002).A05();
                                            t0g2.A01(A172, A0H);
                                        } else if (A002 instanceof R2e) {
                                            ((R2e) A002).A05(t0g2, A172);
                                        } else {
                                            StringBuilder A1C2 = AbstractC166987dD.A1C();
                                            A12 = AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(A002, "Unsupported type of node used in property node ", A1C2), A1C2);
                                        }
                                    } else {
                                        A12 = AbstractC166987dD.A12("Mapped style node does not exist");
                                    }
                                }
                            } else if (A00 instanceof R2f) {
                                R2f r2f3 = (R2f) A00;
                                if (r2f3 instanceof R2y) {
                                    obj2 = ((R2y) r2f3).A02;
                                } else {
                                    obj2 = null;
                                }
                                if (obj2 instanceof Integer) {
                                    t0g = c60519R2b.A03;
                                    A0H2 = AbstractC166987dD.A0H(obj2);
                                    t0g.A01(A17, A0H2);
                                } else if (obj2 instanceof String) {
                                    c60519R2b.A03.putString(A17, (String) obj2);
                                } else {
                                    c60519R2b.A03.putDouble(A17, r2f3.A05());
                                }
                            } else if (A00 instanceof R2d) {
                                t0g = c60519R2b.A03;
                                A0H2 = ((R2d) A00).A05();
                                t0g.A01(A17, A0H2);
                            } else if (A00 instanceof R2e) {
                                ((R2e) A00).A05(c60519R2b.A03, A17);
                            } else {
                                StringBuilder A1C3 = AbstractC166987dD.A1C();
                                A12 = AbstractC43594JPz.A0n(AbstractC58318PtA.A0X(A00, "Unsupported type of node used in property node ", A1C3), A1C3);
                            }
                            C0I2.A05("NativeAnimatedNodesManager", "Native animation workaround, frame lost as result of race condition", e);
                        } else {
                            A12 = AbstractC166987dD.A12("Mapped property node does not exist");
                        }
                        throw A12;
                    }
                    InterfaceC65589TnT interfaceC65589TnT = c60519R2b.A01;
                    if (interfaceC65589TnT != null) {
                        interfaceC65589TnT.synchronouslyUpdateViewOnUIThread(c60519R2b.A00, c60519R2b.A03);
                    }
                }
            }
            if ((abstractC62966SZj5 instanceof R2f) && (interfaceC65350Tid = (r2f = (R2f) abstractC62966SZj5).A02) != null) {
                interfaceC65350Tid.Dye(r2f.A05());
            }
            if (abstractC62966SZj5.A03 != null) {
                for (int i14 = 0; i14 < abstractC62966SZj5.A03.size(); i14++) {
                    AbstractC62966SZj abstractC62966SZj6 = (AbstractC62966SZj) abstractC62966SZj5.A03.get(i14);
                    int i15 = abstractC62966SZj6.A01 - 1;
                    abstractC62966SZj6.A01 = i15;
                    int i16 = abstractC62966SZj6.A00;
                    int i17 = c63347Si4.A02;
                    if (i16 != i17 && i15 == 0) {
                        abstractC62966SZj6.A00 = i17;
                        i9++;
                        arrayDeque.add(abstractC62966SZj6);
                    } else if (i16 == i17) {
                        i12++;
                    }
                }
            }
        }
        if (i2 != i9) {
            if (!c63347Si4.A03) {
                c63347Si4.A03 = true;
                C0I2.A03("NativeAnimatedNodesManager", "Detected animation cycle or disconnected graph. ");
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    AbstractC62966SZj abstractC62966SZj7 = (AbstractC62966SZj) it3.next();
                    List list3 = abstractC62966SZj7.A03;
                    if (list3 != null) {
                        str2 = AbstractC31175DnJ.A0a(" ", list3);
                    } else {
                        str2 = null;
                    }
                    String A03 = abstractC62966SZj7.A03();
                    if (str2 != null && !AbstractC001900j.A0T(str2)) {
                        str3 = AnonymousClass001.A0R(" children: ", str2);
                    } else {
                        str3 = "";
                    }
                    C0I2.A03("NativeAnimatedNodesManager", AnonymousClass001.A0R(A03, str3));
                }
                if (i12 > 0) {
                    str = AnonymousClass001.A0c("cycles (", ")", i12);
                } else {
                    str = "disconnected regions";
                }
                IllegalStateException A14 = AbstractC166987dD.A14(AnonymousClass001.A0y("Looks like animated nodes graph has ", str, ", there are ", " but toposort visited only ", i2, i9));
                if (c63347Si4.A00) {
                    ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new RuntimeException(A14));
                    return;
                }
                throw A14;
            }
            return;
        }
        c63347Si4.A03 = false;
    }

    public final void A0A(int i, int i2) {
        SparseArray sparseArray = this.A05;
        AbstractC62966SZj abstractC62966SZj = (AbstractC62966SZj) sparseArray.get(i);
        if (abstractC62966SZj != null) {
            AbstractC62966SZj abstractC62966SZj2 = (AbstractC62966SZj) sparseArray.get(i2);
            if (abstractC62966SZj2 != null) {
                List list = abstractC62966SZj.A03;
                if (list == null) {
                    list = AbstractC25225BEi.A17(1);
                    abstractC62966SZj.A03 = list;
                }
                list.add(abstractC62966SZj2);
                if (abstractC62966SZj2 instanceof R2y) {
                    R2y r2y = (R2y) abstractC62966SZj2;
                    if (r2y.A00 == null) {
                        if (abstractC62966SZj instanceof R2f) {
                            r2y.A00 = (R2f) abstractC62966SZj;
                        } else {
                            throw AbstractC166987dD.A12("Parent is of an invalid type");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Parent already attached");
                    }
                }
                this.A06.put(i2, abstractC62966SZj2);
                return;
            }
            throw TXV.A00("connectAnimatedNodes: Animated node with tag (child) [", "] does not exist", i2);
        }
        throw TXV.A00("connectAnimatedNodes: Animated node with tag (parent) [", "] does not exist", i);
    }

    public final void A0C(int i, int i2) {
        SparseArray sparseArray = this.A05;
        AbstractC62966SZj abstractC62966SZj = (AbstractC62966SZj) sparseArray.get(i);
        if (abstractC62966SZj != null) {
            AbstractC62966SZj abstractC62966SZj2 = (AbstractC62966SZj) sparseArray.get(i2);
            if (abstractC62966SZj2 != null) {
                List list = abstractC62966SZj.A03;
                if (list != null) {
                    if (abstractC62966SZj2 instanceof R2y) {
                        R2y r2y = (R2y) abstractC62966SZj2;
                        if (abstractC62966SZj == r2y.A00) {
                            r2y.A00 = null;
                        } else {
                            throw AbstractC166987dD.A12("Invalid parent node provided");
                        }
                    }
                    list.remove(abstractC62966SZj2);
                }
                this.A06.put(i2, abstractC62966SZj2);
                return;
            }
            throw TXV.A00("disconnectAnimatedNodes: Animated node with tag (child) [", "] does not exist", i2);
        }
        throw TXV.A00("disconnectAnimatedNodes: Animated node with tag (parent) [", "] does not exist", i);
    }

    public final void A0E(int i, ReadableMap readableMap) {
        AbstractC62966SZj r2e;
        SparseArray sparseArray = this.A05;
        if (sparseArray.get(i) == null) {
            String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            if ("style".equals(string)) {
                r2e = new R2Z(this, readableMap);
            } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(string)) {
                r2e = new R2f(readableMap);
            } else if ("color".equals(string)) {
                r2e = new R2d(this, this.A07, readableMap);
            } else if ("props".equals(string)) {
                r2e = new C60519R2b(this, readableMap);
            } else if ("interpolation".equals(string)) {
                r2e = new R2y(readableMap);
            } else if ("addition".equals(string)) {
                r2e = new C60528R2s(this, readableMap);
            } else if ("subtraction".equals(string)) {
                r2e = new C60531R2v(this, readableMap);
            } else if ("division".equals(string)) {
                r2e = new C60529R2t(this, readableMap);
            } else if ("multiplication".equals(string)) {
                r2e = new C60530R2u(this, readableMap);
            } else if ("modulus".equals(string)) {
                r2e = new R2w(this, readableMap);
            } else if ("diffclamp".equals(string)) {
                r2e = new R2x(this, readableMap);
            } else if ("transform".equals(string)) {
                r2e = new C60518R2a(this, readableMap);
            } else if ("tracking".equals(string)) {
                r2e = new C60520R2c(this, readableMap);
            } else if ("object".equals(string)) {
                r2e = new R2e(this, readableMap);
            } else {
                throw new RuntimeException(AnonymousClass001.A0R("Unsupported node type: ", string));
            }
            r2e.A02 = i;
            sparseArray.put(i, r2e);
            this.A06.put(i, r2e);
            return;
        }
        throw TXV.A00("createAnimatedNode: Animated node [", "] already exists", i);
    }

    public final void A0G(int i, String str, int i2) {
        if (str.startsWith("on")) {
            str = AnonymousClass001.A0R("top", str.substring(2));
        }
        ListIterator listIterator = this.A08.listIterator();
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            EventAnimationDriver eventAnimationDriver = (EventAnimationDriver) listIterator.next();
            if (str.equals(eventAnimationDriver.eventName) && i == eventAnimationDriver.viewTag && i2 == ((AbstractC62966SZj) eventAnimationDriver.valueNode).A02) {
                listIterator.remove();
                break;
            }
        }
        if (str.equals("topScroll")) {
            A0G(i, "topScrollEnded", i2);
        }
    }

    public final void A0H(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        AbstractC62966SZj A00 = A00(this, i2);
        if (A00 != null) {
            if (A00 instanceof R2f) {
                ReadableArray array = readableMap.getArray("nativeEventPath");
                ArrayList A17 = AbstractC25225BEi.A17(array.size());
                for (int i3 = 0; i3 < array.size(); i3++) {
                    A17.add(array.getString(i3));
                }
                if (str.startsWith("on")) {
                    str = AnonymousClass001.A0R("top", str.substring(2));
                }
                this.A08.add(new EventAnimationDriver(str, i, A17, (R2f) A00));
                if (str.equals("topScroll")) {
                    A0H(i, "topScrollEnded", readableMap);
                    return;
                }
                return;
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("addAnimatedEventToView: Animated node on view [");
            A1C.append(i);
            A1C.append("] connected to event handler (");
            A1C.append(str);
            A1C.append(") should be of type ");
            throw new RuntimeException(AbstractC166997dE.A0x(R2f.class.getName(), A1C));
        }
        throw TXV.A00("addAnimatedEventToView: Animated node with tag [", "] does not exist", i2);
    }

    public C63347Si4(R3M r3m) {
        this.A07 = r3m;
    }

    public final void A04(int i) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null && (A00 instanceof R2f)) {
            R2f r2f = (R2f) A00;
            r2f.A01 += r2f.A00;
            r2f.A00 = 0.0d;
            return;
        }
        throw TXV.A00("extractAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i);
    }

    public final void A05(int i) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null && (A00 instanceof R2f)) {
            R2f r2f = (R2f) A00;
            r2f.A00 += r2f.A01;
            r2f.A01 = 0.0d;
            return;
        }
        throw TXV.A00("flattenAnimatedNodeOffset: Animated node [", "] does not exist, or is not a 'value' node", i);
    }

    public final void A06(int i) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null) {
            if (A00 instanceof C60519R2b) {
                C60519R2b c60519R2b = (C60519R2b) A00;
                int i2 = c60519R2b.A00;
                if (i2 != -1 && i2 % 2 != 0) {
                    T0G t0g = c60519R2b.A03;
                    ReadableMapKeySetIterator keySetIterator = t0g.keySetIterator();
                    while (keySetIterator.CLQ()) {
                        t0g.A00.put(keySetIterator.Csu(), null);
                    }
                    InterfaceC65589TnT interfaceC65589TnT = c60519R2b.A01;
                    if (interfaceC65589TnT != null) {
                        interfaceC65589TnT.synchronouslyUpdateViewOnUIThread(c60519R2b.A00, t0g);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException(AbstractC58319PtB.A0t(C60519R2b.class, "Animated node connected to view [?] should be of type "));
        }
    }

    public final void A08(int i, double d) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null && (A00 instanceof R2f)) {
            A01(A00);
            ((R2f) A00).A00 = d;
            this.A06.put(i, A00);
            return;
        }
        throw TXV.A00("setAnimatedNodeValue: Animated node [", "] does not exist, or is not a 'value' node", i);
    }

    public final void A09(int i, int i2) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null) {
            if (A00 instanceof C60519R2b) {
                R3M r3m = this.A07;
                int i3 = 2;
                if (i2 % 2 != 0) {
                    i3 = 1;
                }
                InterfaceC65589TnT A03 = UIManagerHelper.A03(r3m, i3, true);
                if (A03 == null) {
                    ReactSoftExceptionLogger.logSoftException("NativeAnimatedNodesManager", new RuntimeException(AnonymousClass001.A0O("connectAnimatedNodeToView: Animated node could not be connected to UIManager - uiManager disappeared for tag: ", i2)));
                    return;
                }
                C60519R2b c60519R2b = (C60519R2b) A00;
                int i4 = c60519R2b.A00;
                if (i4 == -1) {
                    c60519R2b.A00 = i2;
                    c60519R2b.A01 = A03;
                    this.A06.put(i, A00);
                    return;
                }
                throw new RuntimeException(AnonymousClass001.A02(((AbstractC62966SZj) c60519R2b).A02, i4, "Animated node ", " is already attached to a view: "));
            }
            throw new RuntimeException(AnonymousClass001.A05(i2, "connectAnimatedNodeToView: Animated node connected to view [", "] should be of type ", C60519R2b.class.getName()));
        }
        throw TXV.A00("connectAnimatedNodeToView: Animated node with tag [", "] does not exist", i);
    }

    public final void A0B(int i, int i2) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null) {
            if (A00 instanceof C60519R2b) {
                C60519R2b c60519R2b = (C60519R2b) A00;
                int i3 = c60519R2b.A00;
                if (i3 != i2 && i3 != -1) {
                    throw new RuntimeException(AnonymousClass001.A02(i2, i3, "Attempting to disconnect view that has not been connected with the given animated node: ", " but is connected to view "));
                }
                c60519R2b.A00 = -1;
                return;
            }
            throw new RuntimeException(AnonymousClass001.A05(i2, "disconnectAnimatedNodeFromView: Animated node connected to view [", "] should be of type ", C60519R2b.class.getName()));
        }
        throw TXV.A00("disconnectAnimatedNodeFromView: Animated node with tag [", "] does not exist", i);
    }

    public final void A0D(int i, Callback callback) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null && (A00 instanceof R2f)) {
            double A05 = ((R2f) A00).A05();
            if (callback != null) {
                AbstractC58321PtD.A1K(callback, Double.valueOf(A05));
                return;
            }
            R3M r3m = this.A07;
            WritableNativeMap A0c = AbstractC58321PtD.A0c();
            A0c.putInt("tag", i);
            A0c.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A05);
            r3m.A0E("onNativeAnimatedModuleGetValue", A0c);
            return;
        }
        throw TXV.A00("getValue: Animated node with tag [", "] does not exist or is not a 'value' node", i);
    }

    public final void A0F(int i, ReadableMap readableMap) {
        AbstractC62966SZj A00 = A00(this, i);
        if (A00 != null) {
            if (A00 instanceof R2d) {
                A01(A00);
                ((R2d) A00).A06(readableMap);
                this.A06.put(i, A00);
                return;
            }
            return;
        }
        throw TXV.A00("updateAnimatedNode: Animated node [", "] does not exist", i);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.R2g] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, X.R2h] */
    public final void A0I(Callback callback, ReadableMap readableMap, int i, int i2) {
        R2i r2i;
        R2i r2i2;
        AbstractC62966SZj A00 = A00(this, i2);
        if (A00 != null) {
            if (A00 instanceof R2f) {
                SparseArray sparseArray = this.A04;
                SMC smc = (SMC) sparseArray.get(i);
                if (smc != null) {
                    smc.A01(readableMap);
                    return;
                }
                String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                if ("frames".equals(string)) {
                    ?? obj = new Object();
                    obj.A05 = -1L;
                    obj.A06 = new double[0];
                    obj.A03 = 1;
                    obj.A02 = 1;
                    r2i2 = obj;
                } else {
                    if ("spring".equals(string)) {
                        r2i = new R2i(readableMap);
                        ((SMC) r2i).A00 = i;
                        ((SMC) r2i).A02 = callback;
                        ((SMC) r2i).A01 = (R2f) A00;
                        sparseArray.put(i, r2i);
                        return;
                    }
                    if ("decay".equals(string)) {
                        ?? obj2 = new Object();
                        obj2.A06 = -1L;
                        obj2.A05 = 1;
                        obj2.A04 = 1;
                        r2i2 = obj2;
                    } else {
                        throw new RuntimeException(AnonymousClass001.A05(i2, "startAnimatingNode: Unsupported animation type [", "]: ", string));
                    }
                }
                r2i2.A01(readableMap);
                r2i = r2i2;
                ((SMC) r2i).A00 = i;
                ((SMC) r2i).A02 = callback;
                ((SMC) r2i).A01 = (R2f) A00;
                sparseArray.put(i, r2i);
                return;
            }
            throw new RuntimeException(AnonymousClass001.A05(i2, "startAnimatingNode: Animated node [", "] should be of type ", R2f.class.getName()));
        }
        throw TXV.A00("startAnimatingNode: Animated node [", "] does not exist", i2);
    }
}
