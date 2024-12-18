package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173737oQ {
    /* JADX WARN: Type inference failed for: r0v11, types: [X.42m, X.7p2] */
    public static final boolean A04(C174057ox c174057ox) {
        int i;
        AbstractC907342m A00;
        String A05;
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        AbstractC907342m abstractC907342m;
        StringBuilder sb4;
        if (c174057ox.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID) == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(AbstractC43591JPw.A00(275));
            sb4 = sb5;
            abstractC907342m = c174057ox;
        } else {
            AbstractC907342m A002 = c174057ox.A00(C174067oy.class, "thumbnail_image");
            if (A002 != null && A002.A05("uri") != null) {
                if (c174057ox.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME) == null) {
                    i = 276;
                    sb2 = new StringBuilder();
                } else {
                    if (!c174057ox.A06("is_exempt_from_attribution") && ((A00 = c174057ox.A00(C174077oz.class, "attribution_user")) == null || A00.A05(AbstractC50529MSi.A02(19, 8, 58)) == null || A00.A05("instagram_user_id") == null)) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(AbstractC43591JPw.A00(274));
                        A05 = c174057ox.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        sb = sb6;
                        sb.append(A05);
                        sb3 = sb;
                        C0w9.A03("IgCameraAREffectsConverter", sb3.toString());
                        return false;
                    }
                    AbstractC907342m A003 = c174057ox.A00(C174087p0.class, "best_instance");
                    if (A003 != null) {
                        return A05(new AbstractC907342m(A003.A00));
                    }
                    i = 273;
                    sb2 = new StringBuilder();
                }
                sb2.append(AbstractC43591JPw.A00(i));
                A05 = c174057ox.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                sb = sb2;
                sb.append(A05);
                sb3 = sb;
                C0w9.A03("IgCameraAREffectsConverter", sb3.toString());
                return false;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(AbstractC43591JPw.A00(277));
            sb4 = sb7;
            abstractC907342m = c174057ox.A00(C174067oy.class, "thumbnail_image");
        }
        sb4.append(abstractC907342m);
        sb3 = sb4;
        C0w9.A03("IgCameraAREffectsConverter", sb3.toString());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e8, code lost:
    
        if (r0.ordinal() != 3) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0282  */
    /* JADX WARN: Type inference failed for: r0v44, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.42m, X.7p2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.42m, X.7p1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.camera.effect.models.CameraAREffect A00(X.C174047ow r62, java.lang.Integer r63, java.lang.String r64) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173737oQ.A00(X.7ow, java.lang.Integer, java.lang.String):com.instagram.camera.effect.models.CameraAREffect");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.7nG, java.lang.Object] */
    public static final List A02(InterfaceC174107p2 interfaceC174107p2) {
        ImmutableList A02 = ((AbstractC907342m) interfaceC174107p2).A02("effect_instructions", C174217pD.class);
        C14360o3.A07(A02);
        ArrayList<InterfaceC174227pE> arrayList = new ArrayList();
        Iterator<E> it = A02.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC174227pE interfaceC174227pE = (InterfaceC174227pE) next;
            if (interfaceC174227pE.C99() != null && interfaceC174227pE.getText() != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        for (InterfaceC174227pE interfaceC174227pE2 : arrayList) {
            String C99 = interfaceC174227pE2.C99();
            C14360o3.A0A(C99);
            String text = interfaceC174227pE2.getText();
            C14360o3.A0A(text);
            ?? obj = new Object();
            obj.A02 = C99;
            obj.A01 = text;
            obj.A00 = null;
            arrayList2.add(obj);
        }
        return arrayList2;
    }

    public static final ArrayList A01(InterfaceC174107p2 interfaceC174107p2) {
        VersionedCapability fromServerValue;
        ImmutableList AlZ = interfaceC174107p2.AlZ();
        C14360o3.A07(AlZ);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = AlZ.iterator();
        while (it.hasNext()) {
            InterfaceC174247pG interfaceC174247pG = (InterfaceC174247pG) it.next();
            String Ala = interfaceC174247pG.Ala();
            if (Ala != null && (fromServerValue = VersionedCapability.fromServerValue(Ala)) != null) {
                arrayList.add(new ARCapabilityMinVersionModeling(fromServerValue, interfaceC174247pG.BU1()));
            }
        }
        return arrayList;
    }

    public static final java.util.Set A03(InterfaceC174107p2 interfaceC174107p2) {
        ImmutableList AlZ = interfaceC174107p2.AlZ();
        if (AlZ != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<E> it = AlZ.iterator();
            while (it.hasNext()) {
                String Ala = ((InterfaceC174247pG) it.next()).Ala();
                if (Ala != null) {
                    arrayList.add(Ala);
                }
            }
            return AbstractC001800i.A0k(arrayList);
        }
        return C16910sj.A00;
    }

    public static final boolean A05(InterfaceC174107p2 interfaceC174107p2) {
        StringBuilder sb;
        int i;
        String id;
        if (interfaceC174107p2.Bas() == null) {
            sb = new StringBuilder();
            sb.append(MSV.A00(832));
            id = interfaceC174107p2.getId();
        } else {
            InterfaceC174127p4 Bas = interfaceC174107p2.Bas();
            C14360o3.A0A(Bas);
            if (Bas.AjY() == null) {
                sb = new StringBuilder();
                i = 830;
            } else {
                InterfaceC174127p4 Bas2 = interfaceC174107p2.Bas();
                C14360o3.A0A(Bas2);
                if (Bas2.Aq6() == null) {
                    sb = new StringBuilder();
                    i = 831;
                } else {
                    InterfaceC174127p4 Bas3 = interfaceC174107p2.Bas();
                    C14360o3.A0A(Bas3);
                    if (Bas3.B6J() == 0) {
                        sb = new StringBuilder();
                        i = 828;
                    } else {
                        InterfaceC174127p4 Bas4 = interfaceC174107p2.Bas();
                        C14360o3.A0A(Bas4);
                        if (Bas4.getUri() == null) {
                            sb = new StringBuilder();
                            i = 829;
                        } else {
                            return true;
                        }
                    }
                }
            }
            sb.append(MSV.A00(i));
            InterfaceC174127p4 Bas5 = interfaceC174107p2.Bas();
            C14360o3.A0A(Bas5);
            id = Bas5.getId();
        }
        sb.append(id);
        C0w9.A03("IgCameraAREffectsConverter", sb.toString());
        return false;
    }
}
