package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KEb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45536KEb extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C75B A01;

    public C45536KEb(C75B c75b, int i) {
        this.A01 = c75b;
        this.A00 = i;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C2JS requiredTreeField;
        ImmutableList requiredCompactedTreeListField;
        C2JS requiredTreeField2;
        String str;
        EnumC150226pU enumC150226pU;
        C2JS c2js;
        int A03 = C0f9.A03(829703252);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A032 = C0f9.A03(773951537);
        C14360o3.A0B(anonymousClass435, 0);
        C2JS c2js2 = (C2JS) anonymousClass435.A01;
        if (c2js2 != null && (requiredTreeField = c2js2.getRequiredTreeField(0, AbstractC111324zv.A00(3319), QYQ.class, 1561923310)) != null && (requiredCompactedTreeListField = requiredTreeField.getRequiredCompactedTreeListField(0, "sections(sections:[\"CUTOUT_STICKER\"])", QYP.class, 236611199)) != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator<E> it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C2JS) next).getRequiredEnumField(0, "section_type", EnumC46236KdC.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) == EnumC46236KdC.CUTOUT_STICKER) {
                    A1E.add(next);
                }
            }
            C2JS c2js3 = (C2JS) AbstractC001800i.A0J(A1E);
            if (c2js3 != null && (requiredTreeField2 = c2js3.getRequiredTreeField(1, "items(after:$after,first:$sticker_count_limit)", QYO.class, -131762000)) != null) {
                ImmutableList requiredCompactedTreeListField2 = requiredTreeField2.getRequiredCompactedTreeListField(0, "edges", QYM.class, 1119921899);
                if (requiredCompactedTreeListField2 != null) {
                    ArrayList A0i = AbstractC167007dF.A0i(requiredCompactedTreeListField2);
                    Iterator<E> it2 = requiredCompactedTreeListField2.iterator();
                    while (it2.hasNext()) {
                        C2JS optionalTreeField = AbstractC25225BEi.A0l(it2).getOptionalTreeField(0, "cutout_sticker_info", QYL.class, 1006619949);
                        if (optionalTreeField != null) {
                            c2js = optionalTreeField.getRequiredTreeField(0, "cutout_sticker", QYJ.class, -1337062749);
                        } else {
                            c2js = null;
                        }
                        A0i.add(c2js);
                    }
                    List A0X = AbstractC001800i.A0X(A0i);
                    ArrayList A0i2 = AbstractC167007dF.A0i(A0X);
                    Iterator it3 = A0X.iterator();
                    while (it3.hasNext()) {
                        C2JS A0l = AbstractC25225BEi.A0l(it3);
                        C148286ly A00 = C148286ly.A00(AbstractC25225BEi.A0t(A0l.getRequiredStringField(2, "image_url")), A0l.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0l.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID), A0l.getRequiredIntField(5, "image_width"), A0l.getRequiredIntField(6, "image_height"), 1.0f);
                        C148276lx c148276lx = C148276lx.A1d;
                        String requiredStringField = A0l.getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        C14360o3.A07(requiredStringField);
                        List A1J = AbstractC166987dD.A1J(A00);
                        if (C14360o3.A0K(A0l.getRequiredStringField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE), MediaStreamTrack.VIDEO_TRACK_KIND)) {
                            enumC150226pU = EnumC150226pU.A0M;
                        } else {
                            enumC150226pU = EnumC150226pU.A0L;
                        }
                        C148276lx c148276lx2 = new C148276lx(enumC150226pU, requiredStringField, A1J);
                        c148276lx2.A0G = Long.valueOf((long) (A0l.getCoercedDoubleField(7, AbstractC111324zv.A00(531)) * 1000.0d));
                        A0i2.add(c148276lx2);
                    }
                    C05A c05a = this.A01.A06;
                    Map A15 = AbstractC43592JPx.A15(c05a);
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    Iterator it4 = A0i2.iterator();
                    while (it4.hasNext()) {
                        C148276lx c148276lx3 = (C148276lx) it4.next();
                        String str2 = c148276lx3.A0Z;
                        C206409Bx c206409Bx = (C206409Bx) A15.get(str2);
                        if (c206409Bx != null) {
                            str = c206409Bx.A01;
                        } else {
                            str = null;
                        }
                        A1I.put(str2, new C206409Bx(c148276lx3, str));
                    }
                    c05a.Egh(AbstractC06930Yk.A04(A15, A1I));
                }
                C2JS requiredTreeField3 = requiredTreeField2.getRequiredTreeField(1, "paging_info", QYN.class, 275716537);
                if (requiredTreeField3 != null) {
                    C75B c75b = this.A01;
                    int i = this.A00;
                    if (AbstractC166987dD.A0N(c75b.A02.getValue()) > AbstractC43592JPx.A15(c75b.A06).size() && requiredTreeField3.getRequiredBooleanField(1, AbstractC111324zv.A00(4935))) {
                        c75b.A01(i, requiredTreeField3.getOptionalStringField(0, "max_id"));
                    }
                }
            }
        }
        C0f9.A0A(-479165736, A032);
        C0f9.A0A(-33630579, A03);
    }
}
