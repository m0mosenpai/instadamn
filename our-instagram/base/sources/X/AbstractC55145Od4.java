package X;

import com.instagram.settings2.core.model.ActionButtonValue$Information;
import com.instagram.settings2.core.model.AndValue;
import com.instagram.settings2.core.model.BloksActionNavigationRowDestinationValue;
import com.instagram.settings2.core.model.BloksNavigationRowDestinationValue;
import com.instagram.settings2.core.model.DerivedStringWrapper;
import com.instagram.settings2.core.model.DictionaryValue;
import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLinkTokenValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtTextTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.FrictionValue$ConfirmationValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.MetaAppInvokeDestinationValue;
import com.instagram.settings2.core.model.ModalActionValue$Navigate;
import com.instagram.settings2.core.model.ModalBodyItemValue;
import com.instagram.settings2.core.model.ModalButtonValue;
import com.instagram.settings2.core.model.ModalValue;
import com.instagram.settings2.core.model.NotValue;
import com.instagram.settings2.core.model.OpenUrlDestinationValue;
import com.instagram.settings2.core.model.OrValue;
import com.instagram.settings2.core.model.ServerValue;
import com.instagram.settings2.core.model.SettingBannerValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Od4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55145Od4 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public static Object A01(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return ((AbstractC55145Od4) obj).A07(null, null, interfaceC23621Ds);
    }

    public InterfaceC37109GWu A05() {
        if (!(this instanceof NVA) && !(this instanceof C72251Xa7) && !(this instanceof EqualsValue) && !(this instanceof AndValue) && !(this instanceof IfValue) && !(this instanceof NVE)) {
            if (!(this instanceof ServerValue)) {
                if (!(this instanceof OrValue) && !(this instanceof ModalBodyItemValue) && !(this instanceof ModalActionValue$Navigate)) {
                    if (this instanceof NVI) {
                        return new C51917Mwz(AbstractC43592JPx.A16(((NVI) this).A00.A02));
                    }
                    if (!(this instanceof ModalButtonValue) && !(this instanceof NotValue) && !(this instanceof ModalValue) && !(this instanceof FbtLiteralValue) && !(this instanceof C52737NVa) && !(this instanceof FbtLinkTokenValue)) {
                        if (!(this instanceof DerivedStringWrapper)) {
                            if (!(this instanceof FbtWithTokensValue) && !(this instanceof DictionaryValue) && !(this instanceof BloksNavigationRowDestinationValue) && !(this instanceof FbtTextTokenValue) && !(this instanceof BloksActionNavigationRowDestinationValue)) {
                                if (this instanceof NVG) {
                                    return C56724PFs.A00;
                                }
                                if (!(this instanceof FrictionValue$ConfirmationValue) && !(this instanceof SettingBannerValue) && !(this instanceof NVf) && !(this instanceof OpenUrlDestinationValue) && !(this instanceof C52738NVe) && !(this instanceof NVd)) {
                                    boolean z = this instanceof NVc;
                                }
                            }
                        }
                    }
                }
            }
            return GGX.A00;
        }
        return GGY.A00;
    }

    public List A08() {
        List A10;
        AbstractC55145Od4 abstractC55145Od4;
        AbstractC55145Od4[] abstractC55145Od4Arr;
        if (this instanceof NVA) {
            Object obj = ((NVA) this).A00;
            if (obj instanceof List) {
                ArrayList<MWT> A1E = AbstractC166987dD.A1E();
                for (Object obj2 : (Iterable) obj) {
                    if (MWT.A01(obj2, 8)) {
                        A1E.add(obj2);
                    }
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (MWT mwt : A1E) {
                    AnonymousClass016.A16(AbstractC001800i.A0S(AbstractC54196Nxa.A00((AbstractC55145Od4) mwt.A00), AbstractC001800i.A0S(AbstractC54196Nxa.A00((AbstractC55145Od4) mwt.A01), AbstractC54196Nxa.A00((AbstractC55145Od4) mwt.A02))), A1E2);
                }
                return A1E2;
            }
            if (MWT.A01(obj, 8)) {
                MWT mwt2 = (MWT) obj;
                AbstractC001800i.A0S(AbstractC54196Nxa.A00((AbstractC55145Od4) mwt2.A00), AbstractC001800i.A0S(AbstractC54196Nxa.A00((AbstractC55145Od4) mwt2.A01), AbstractC54196Nxa.A00((AbstractC55145Od4) mwt2.A02)));
            }
            return C16930sl.A00;
        }
        if (!(this instanceof C72251Xa7)) {
            if (this instanceof EqualsValue) {
                EqualsValue equalsValue = (EqualsValue) this;
                List A1Q = AbstractC16960so.A1Q(equalsValue.A00, equalsValue.A01);
                A10 = AbstractC166987dD.A1E();
                Iterator it = A1Q.iterator();
                while (it.hasNext()) {
                    A04(A10, it);
                }
            } else if (!(this instanceof NVE)) {
                if (this instanceof AndValue) {
                    List list = ((AndValue) this).A00;
                    A10 = AbstractC166987dD.A1E();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        A04(A10, it2);
                    }
                } else if (!(this instanceof ServerValue)) {
                    if (this instanceof IfValue) {
                        IfValue ifValue = (IfValue) this;
                        List A1Q2 = AbstractC16960so.A1Q(ifValue.A00, ifValue.A02, ifValue.A01);
                        A10 = AbstractC166987dD.A1E();
                        Iterator it3 = A1Q2.iterator();
                        while (it3.hasNext()) {
                            A04(A10, it3);
                        }
                    } else if (this instanceof OrValue) {
                        List list2 = ((OrValue) this).A00;
                        A10 = AbstractC166987dD.A1E();
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            A04(A10, it4);
                        }
                    } else if (this instanceof ModalActionValue$Navigate) {
                        List singletonList = Collections.singletonList(((ModalActionValue$Navigate) this).A00);
                        A10 = AbstractC31174DnI.A10(singletonList);
                        Iterator it5 = singletonList.iterator();
                        while (it5.hasNext()) {
                            A04(A10, it5);
                        }
                    } else if (this instanceof ModalBodyItemValue) {
                        ModalBodyItemValue modalBodyItemValue = (ModalBodyItemValue) this;
                        AbstractC55145Od4 abstractC55145Od42 = modalBodyItemValue.A00;
                        AbstractC55145Od4 abstractC55145Od43 = modalBodyItemValue.A01;
                        AbstractC55145Od4 abstractC55145Od44 = modalBodyItemValue.A02;
                        if (abstractC55145Od42 != null) {
                            abstractC55145Od4Arr = new AbstractC55145Od4[]{abstractC55145Od43, abstractC55145Od42, abstractC55145Od44};
                        } else {
                            abstractC55145Od4Arr = new AbstractC55145Od4[]{abstractC55145Od43, abstractC55145Od44};
                        }
                        List A1Q3 = AbstractC16960so.A1Q(abstractC55145Od4Arr);
                        A10 = AbstractC166987dD.A1E();
                        Iterator it6 = A1Q3.iterator();
                        while (it6.hasNext()) {
                            A04(A10, it6);
                        }
                    } else if (!(this instanceof NVI)) {
                        if (this instanceof ModalButtonValue) {
                            ModalButtonValue modalButtonValue = (ModalButtonValue) this;
                            List A1Q4 = AbstractC16960so.A1Q(modalButtonValue.A01, modalButtonValue.A00);
                            A10 = AbstractC166987dD.A1E();
                            Iterator it7 = A1Q4.iterator();
                            while (it7.hasNext()) {
                                A04(A10, it7);
                            }
                        } else if (this instanceof NotValue) {
                            A10 = AbstractC54196Nxa.A00(((NotValue) this).A00);
                        } else if (this instanceof ModalValue) {
                            ModalValue modalValue = (ModalValue) this;
                            List A0X = AbstractC001800i.A0X(AbstractC001800i.A0S(modalValue.A05, AbstractC16960so.A1Q(modalValue.A04, modalValue.A01, modalValue.A02, modalValue.A03, modalValue.A00)));
                            A10 = AbstractC166987dD.A1E();
                            Iterator it8 = A0X.iterator();
                            while (it8.hasNext()) {
                                A04(A10, it8);
                            }
                        } else {
                            if (this instanceof FbtLiteralValue) {
                                abstractC55145Od4 = ((FbtLiteralValue) this).A00;
                            } else if (!(this instanceof C52737NVa)) {
                                if (this instanceof FbtLinkTokenValue) {
                                    FbtLinkTokenValue fbtLinkTokenValue = (FbtLinkTokenValue) this;
                                    List A1Q5 = AbstractC16960so.A1Q(fbtLinkTokenValue.A00, fbtLinkTokenValue.A01);
                                    A10 = AbstractC166987dD.A1E();
                                    Iterator it9 = A1Q5.iterator();
                                    while (it9.hasNext()) {
                                        A04(A10, it9);
                                    }
                                } else if (this instanceof BloksNavigationRowDestinationValue) {
                                    BloksNavigationRowDestinationValue bloksNavigationRowDestinationValue = (BloksNavigationRowDestinationValue) this;
                                    List A1Q6 = AbstractC16960so.A1Q(bloksNavigationRowDestinationValue.A00, bloksNavigationRowDestinationValue.A02, bloksNavigationRowDestinationValue.A01);
                                    A10 = AbstractC166987dD.A1E();
                                    Iterator it10 = A1Q6.iterator();
                                    while (it10.hasNext()) {
                                        A04(A10, it10);
                                    }
                                } else if (this instanceof DictionaryValue) {
                                    DictionaryValue dictionaryValue = (DictionaryValue) this;
                                    ArrayList A0S = AbstractC001800i.A0S(dictionaryValue.A01, dictionaryValue.A00);
                                    A10 = AbstractC166987dD.A1E();
                                    Iterator it11 = A0S.iterator();
                                    while (it11.hasNext()) {
                                        A04(A10, it11);
                                    }
                                } else {
                                    if (this instanceof DerivedStringWrapper) {
                                        return AbstractC166987dD.A1J(((DerivedStringWrapper) this).A00);
                                    }
                                    if (this instanceof FbtWithTokensValue) {
                                        List list3 = ((FbtWithTokensValue) this).A01;
                                        A10 = AbstractC166987dD.A1E();
                                        Iterator it12 = list3.iterator();
                                        while (it12.hasNext()) {
                                            A04(A10, it12);
                                        }
                                    } else if (this instanceof FbtTextTokenValue) {
                                        List singletonList2 = Collections.singletonList(((FbtTextTokenValue) this).A00);
                                        A10 = AbstractC31174DnI.A10(singletonList2);
                                        Iterator it13 = singletonList2.iterator();
                                        while (it13.hasNext()) {
                                            A04(A10, it13);
                                        }
                                    } else if (this instanceof BloksActionNavigationRowDestinationValue) {
                                        abstractC55145Od4 = ((BloksActionNavigationRowDestinationValue) this).A00;
                                    } else if (this instanceof FrictionValue$ConfirmationValue) {
                                        List singletonList3 = Collections.singletonList(((FrictionValue$ConfirmationValue) this).A00);
                                        A10 = AbstractC31174DnI.A10(singletonList3);
                                        Iterator it14 = singletonList3.iterator();
                                        while (it14.hasNext()) {
                                            A04(A10, it14);
                                        }
                                    } else if (this instanceof SettingBannerValue) {
                                        SettingBannerValue settingBannerValue = (SettingBannerValue) this;
                                        List A1Q7 = AbstractC16960so.A1Q(settingBannerValue.A03, settingBannerValue.A02, settingBannerValue.A01, settingBannerValue.A00);
                                        A10 = AbstractC166987dD.A1E();
                                        Iterator it15 = A1Q7.iterator();
                                        while (it15.hasNext()) {
                                            A04(A10, it15);
                                        }
                                    } else if (!(this instanceof NVf) && !(this instanceof NVG)) {
                                        if (this instanceof OpenUrlDestinationValue) {
                                            List singletonList4 = Collections.singletonList(((OpenUrlDestinationValue) this).A00);
                                            A10 = AbstractC31174DnI.A10(singletonList4);
                                            Iterator it16 = singletonList4.iterator();
                                            while (it16.hasNext()) {
                                                A04(A10, it16);
                                            }
                                        } else if (!(this instanceof C52738NVe) && !(this instanceof NVd) && !(this instanceof NVc)) {
                                            if (this instanceof MetaAppInvokeDestinationValue) {
                                                MetaAppInvokeDestinationValue metaAppInvokeDestinationValue = (MetaAppInvokeDestinationValue) this;
                                                List A1Q8 = AbstractC16960so.A1Q(metaAppInvokeDestinationValue.A01, metaAppInvokeDestinationValue.A03, metaAppInvokeDestinationValue.A02, metaAppInvokeDestinationValue.A00);
                                                A10 = AbstractC166987dD.A1E();
                                                Iterator it17 = A1Q8.iterator();
                                                while (it17.hasNext()) {
                                                    A04(A10, it17);
                                                }
                                            } else if (this instanceof ActionButtonValue$Information) {
                                                List singletonList5 = Collections.singletonList(((ActionButtonValue$Information) this).A00);
                                                A10 = AbstractC31174DnI.A10(singletonList5);
                                                Iterator it18 = singletonList5.iterator();
                                                while (it18.hasNext()) {
                                                    A04(A10, it18);
                                                }
                                            } else {
                                                List singletonList6 = Collections.singletonList(((NVP) this).A00);
                                                A10 = AbstractC31174DnI.A10(singletonList6);
                                                Iterator it19 = singletonList6.iterator();
                                                while (it19.hasNext()) {
                                                    A04(A10, it19);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return AbstractC54196Nxa.A00(abstractC55145Od4);
                        }
                    }
                }
            }
            return AbstractC001800i.A0W(A10);
        }
        return C16930sl.A00;
    }

    public static String A02(Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(" }");
        return sb.toString();
    }

    public static void A03(StringBuilder sb, String str) {
        sb.append(str);
        sb.append(": { ");
    }

    public static void A04(Collection collection, Iterator it) {
        AnonymousClass016.A16(AbstractC54196Nxa.A00((AbstractC55145Od4) it.next()), collection);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r2.isEmpty() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r2.isEmpty() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        r4 = X.AbstractC166987dD.A1E();
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r2.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if ((r1 instanceof X.C51917Mwz) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r4.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        r2 = X.AbstractC166987dD.A1E();
        r1 = r4.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00af, code lost:
    
        if (r1.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b1, code lost:
    
        X.AnonymousClass016.A16(((X.C51917Mwz) r1.next()).A00, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        r1 = X.AbstractC001800i.A0k(X.AbstractC001800i.A0W(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (X.AbstractC31171DnF.A1b(r1) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        return new X.C51917Mwz(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r1.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009e, code lost:
    
        if ((r1.next() instanceof X.C56723PFr) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        r3 = X.C56723PFr.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0072, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
    
        if (r1.hasNext() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0086, code lost:
    
        if ((r1.next() instanceof X.GGX) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0088, code lost:
    
        r3 = X.GGX.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
    
        if (r4 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0073, code lost:
    
        if (r4 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC37109GWu A06() {
        /*
            r5 = this;
            X.GWu r3 = r5.A05()
            boolean r0 = r3 instanceof X.C56724PFs
            if (r0 != 0) goto Ld0
            java.util.List r0 = r5.A08()
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L28
            java.lang.Object r0 = r1.next()
            X.Od4 r0 = (X.AbstractC55145Od4) r0
            X.GWu r0 = r0.A06()
            r2.add(r0)
            goto L14
        L28:
            java.util.ArrayList r2 = X.AbstractC001800i.A0T(r3, r2)
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L5c
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5c
        L36:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L76
        L3c:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8e
        L42:
            java.util.ArrayList r4 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r2.iterator()
        L4a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C51917Mwz
            if (r0 == 0) goto L4a
            r4.add(r1)
            goto L4a
        L5c:
            java.util.Iterator r1 = r2.iterator()
        L60:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C56724PFs
            if (r0 == 0) goto L60
            X.PFs r3 = X.C56724PFs.A00
        L70:
            X.GWu r3 = (X.InterfaceC37109GWu) r3
            return r3
        L73:
            if (r4 == 0) goto L76
            goto L36
        L76:
            java.util.Iterator r1 = r2.iterator()
        L7a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.GGX
            if (r0 == 0) goto L7a
            X.GGX r3 = X.GGX.A00
            goto L70
        L8b:
            if (r4 == 0) goto L8e
            goto L3c
        L8e:
            java.util.Iterator r1 = r2.iterator()
        L92:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof X.C56723PFr
            if (r0 == 0) goto L92
            X.PFr r3 = X.C56723PFr.A00
            goto L70
        La3:
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            java.util.Iterator r1 = r4.iterator()
        Lab:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r1.next()
            X.Mwz r0 = (X.C51917Mwz) r0
            java.util.Set r0 = r0.A00
            X.AnonymousClass016.A16(r0, r2)
            goto Lab
        Lbd:
            java.util.List r0 = X.AbstractC001800i.A0W(r2)
            java.util.Set r1 = X.AbstractC001800i.A0k(r0)
            boolean r0 = X.AbstractC31171DnF.A1b(r1)
            if (r0 == 0) goto Ld0
            X.Mwz r3 = new X.Mwz
            r3.<init>(r1)
        Ld0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55145Od4.A06():X.GWu");
    }

    public String toString() {
        Class<?> cls = getClass();
        Map map = C0YZ.A03;
        C14360o3.A0B(cls, 1);
        return AnonymousClass001.A0G(AbstractC13230m9.A01(cls), ':', hashCode());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:366:0x06dc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[PHI: r7
      0x0084: PHI (r7v79 java.lang.Object) = (r7v78 java.lang.Object), (r7v75 java.lang.Object) binds: [B:27:0x0075, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x048f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a1f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x09ec  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ae7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0ac0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0aa0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0b6d  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0bac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0b80  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0bf8  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0cbb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0c9b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0d18  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0de2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:147:0x0315 -> B:139:0x02e2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:454:0x0905 -> B:444:0x08bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00eb -> B:45:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A07(com.instagram.common.session.UserSession r20, com.instagram.settings2.core.session.AbstractValueResolverImpl r21, X.InterfaceC23621Ds r22) {
        /*
            Method dump skipped, instructions count: 3624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC55145Od4.A07(com.instagram.common.session.UserSession, com.instagram.settings2.core.session.AbstractValueResolverImpl, X.1Ds):java.lang.Object");
    }
}
