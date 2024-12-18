package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.WVu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70442WVu implements InterfaceC48192Ji {
    public final /* synthetic */ C195448kk A00;

    public C70442WVu(C195448kk c195448kk) {
        this.A00 = c195448kk;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        Object obj;
        C2JS c2js;
        C2JS optionalTreeField;
        C2JS requiredTreeField;
        ImmutableList requiredCompactedTreeListField;
        String str;
        C9CO c9co;
        Integer num;
        ImmutableList requiredCompactedTreeListField2;
        C2JS reinterpretIfFulfillsType;
        C2JS A01;
        VFY A02 = WGT.A02(anonymousClass436);
        VFY vfy = VFY.OPTED_IN;
        C05A c05a = this.A00.A03;
        if (A02 == vfy) {
            VFY A022 = WGT.A02(anonymousClass436);
            if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "meta_gallery", C66922UdG.class, -1545310103)) != null && (requiredTreeField = optionalTreeField.getRequiredTreeField(1, "albums(after:$after,first:$first)", C66921UdF.class, 1033643324)) != null && (requiredCompactedTreeListField = requiredTreeField.getRequiredCompactedTreeListField(0, "nodes", C66920UdE.class, 1747410905)) != null) {
                ArrayList A0q = AbstractC167017dG.A0q(requiredCompactedTreeListField);
                Iterator<E> it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C2JS c2js2 = (C2JS) it.next();
                    C14360o3.A0A(c2js2);
                    C2JS optionalTreeField2 = c2js2.getOptionalTreeField(4, "assets(first:$assets_first)", C66919UdD.class, -214999150);
                    if (optionalTreeField2 != null && (requiredCompactedTreeListField2 = optionalTreeField2.getRequiredCompactedTreeListField(1, "nodes", C66918UdC.class, -1309324893)) != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<E> it2 = requiredCompactedTreeListField2.iterator();
                        while (it2.hasNext()) {
                            C2JS c2js3 = (C2JS) it2.next();
                            C2JS reinterpretIfFulfillsType2 = c2js3.reinterpretIfFulfillsType(0, "MetaGalleryPhoto", C66929UdN.class, 1869172584);
                            if ((reinterpretIfFulfillsType2 != null && (A01 = reinterpretIfFulfillsType2.A01(C67536Una.class, -851351358)) != null) || ((reinterpretIfFulfillsType = c2js3.reinterpretIfFulfillsType(1, "MetaGalleryVideo", C66930UdO.class, -1506827412)) != null && (A01 = reinterpretIfFulfillsType.A01(C67536Una.class, -851351358)) != null)) {
                                arrayList.add(new SimpleImageUrl(A01.getOptionalStringField(4, "thumbnail")));
                            }
                        }
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            C1OG A0J = C25821No.A00().A0J((ImageUrl) it3.next(), "MetaGalleryUtils");
                            A0J.A0I = true;
                            A0J.A0L = true;
                            A0J.A01();
                        }
                    }
                    String A07 = c2js2.A07("strong_id__");
                    String optionalStringField = c2js2.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    EnumC39600HeA enumC39600HeA = (EnumC39600HeA) c2js2.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EnumC39600HeA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (enumC39600HeA != null) {
                        int ordinal = enumC39600HeA.ordinal();
                        if (ordinal != 2) {
                            if (ordinal == 4) {
                                str = "OCULUS";
                            }
                        } else {
                            str = "HORIZON";
                        }
                        if (A07 == null && optionalStringField != null && str != null && A022 != null) {
                            String A0A = c2js2.A0A("thumbnail");
                            C2JS optionalTreeField3 = c2js2.getOptionalTreeField(4, "assets(first:$assets_first)", C66919UdD.class, -214999150);
                            if (optionalTreeField3 != null) {
                                num = AbstractC37304Gc5.A0Z(optionalTreeField3, "count", 0);
                            } else {
                                num = null;
                            }
                            c9co = new C9CO(A022, num, A07, optionalStringField, str, A0A);
                        } else {
                            c9co = null;
                        }
                        A0q.add(c9co);
                    }
                    str = null;
                    if (A07 == null) {
                    }
                    c9co = null;
                    A0q.add(c9co);
                }
                obj = AbstractC001800i.A0X(A0q);
                c05a.Egh(obj);
            }
        }
        obj = C16930sl.A00;
        c05a.Egh(obj);
    }
}
