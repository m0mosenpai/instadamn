package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes10.dex */
public final class TW4 implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public TW4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:212:0x055b. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Object, X.Rpw] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, X.Rpx] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, X.Rpx] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, X.Rpw] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, X.Rpx] */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.SMn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15, types: [X.SLX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.SMn, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String string;
        String str;
        String str2;
        Q1y q1y;
        List singletonList;
        int i;
        int i2;
        String string2;
        int i3;
        Q1y q1y2;
        String string3;
        int i4;
        SLX slx;
        int i5;
        C60613RDi A00;
        String str3;
        int i6;
        List unmodifiableList;
        int i7;
        C62699SMn c62699SMn;
        C62699SMn c62699SMn2;
        C62699SMn c62699SMn3;
        C62699SMn c62699SMn4;
        C62699SMn c62699SMn5;
        C61574Rpx c61574Rpx;
        Q1y q1y3;
        int i8;
        int i9;
        int i10;
        SLX slx2;
        SLX slx3;
        SLX slx4;
        int i11;
        SLX slx5;
        SLX slx6;
        SLX slx7;
        SLX slx8;
        C62699SMn c62699SMn6;
        int i12;
        C62699SMn c62699SMn7;
        int i13;
        C62699SMn c62699SMn8;
        C3AY c3ay;
        Object obj2;
        Object obj3;
        QSK A002;
        String str4;
        String str5;
        String str6;
        SLH slh;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        if (this.A00 != 0) {
            return C2043992v.A00((C2043992v) this.A01, (C2043892u) this.A02, (C9ZZ) this.A03, (InterfaceC23621Ds) obj);
        }
        C63406Sjd c63406Sjd = (C63406Sjd) obj;
        C61549RpU c61549RpU = (C61549RpU) this.A02;
        if (!NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED.equals(c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED))) {
            string = c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        } else {
            string = c61549RpU.A00.getString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        }
        boolean equals = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED.equals(c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED));
        Bundle bundle = c61549RpU.A00;
        if (!equals) {
            str = "BUNDLE_KEY_TERTIARY_FLOW_STEP_TYPE";
        } else {
            boolean equals2 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED.equals(bundle.getString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED));
            bundle = c61549RpU.A00;
            if (!equals2) {
                str = "BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE";
            } else {
                str = "BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE";
            }
        }
        String string4 = bundle.getString(str, NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
        Object obj5 = c63406Sjd.A01;
        Object obj6 = null;
        String str18 = null;
        obj6 = null;
        obj6 = null;
        String str19 = null;
        obj6 = null;
        String str20 = null;
        obj6 = null;
        String str21 = null;
        obj6 = null;
        obj6 = null;
        obj6 = null;
        obj6 = null;
        obj6 = null;
        obj6 = null;
        if (obj5 != null && (obj2 = (c3ay = (C3AY) obj5).A00) != null && (obj3 = c3ay.A01) != null) {
            QSL qsl = (QSL) obj2;
            QS6 qs6 = (QS6) obj3;
            if (NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED.equals(c61549RpU.A00.getString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED))) {
                A002 = C63337Shp.A01(qsl, c61549RpU.A00.getString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED));
            } else {
                boolean equals3 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED.equals(c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED));
                QSK A01 = C63337Shp.A01(qsl, c61549RpU.A00.getString("BUNDLE_KEY_PRIMARY_FLOW_STEP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED));
                String string5 = c61549RpU.A00.getString("BUNDLE_KEY_SECONDARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                String string6 = c61549RpU.A00.getString("BUNDLE_KEY_SECONDARY_FLOW_STEP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                if (!equals3) {
                    A01 = C63337Shp.A00(qs6, A01, string5, string6);
                    string5 = c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                    string6 = c61549RpU.A00.getString("BUNDLE_KEY_TERTIARY_FLOW_STEP_TYPE", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);
                }
                A002 = C63337Shp.A00(qs6, A01, string5, string6);
            }
            if (A002 != null) {
                EnumC61195Rgv enumC61195Rgv = EnumC61195Rgv.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                if (A002.getOptionalEnumField(1, "screen_type", enumC61195Rgv) != null) {
                    EnumC72400Xcn enumC72400Xcn = EnumC72400Xcn.A02;
                    if (A002.getOptionalEnumField(2, TraceFieldType.ContentType, enumC72400Xcn) != null) {
                        int ordinal = ((EnumC61195Rgv) A002.getOptionalEnumField(1, "screen_type", enumC61195Rgv)).ordinal();
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal != 1) {
                                    if (ordinal == 4) {
                                        C1LC A0a = AbstractC58319PtB.A0a(qs6, QS5.class, "verification_screens", 4, -668383159);
                                        while (A0a.hasNext()) {
                                            C60476R0c c60476R0c = (C60476R0c) AbstractC25225BEi.A0l(A0a).reinterpretRequired(0, C60476R0c.class, -2103800391);
                                            if (A002.getOptionalEnumField(2, TraceFieldType.ContentType, enumC72400Xcn) == c60476R0c.getOptionalEnumField(1, TraceFieldType.ContentType, enumC72400Xcn)) {
                                                SLH slh2 = null;
                                                if (c60476R0c.getOptionalTreeField(2, DialogModule.KEY_TITLE, QX4.class, 250335954) != null) {
                                                    str13 = AbstractC58318PtA.A0h(c60476R0c.getOptionalTreeField(2, DialogModule.KEY_TITLE, QX4.class, 250335954));
                                                } else {
                                                    str13 = null;
                                                }
                                                if (c60476R0c.getOptionalTreeField(3, "subtitle", QX2.class, 332901649) != null) {
                                                    str14 = AbstractC58318PtA.A0h(c60476R0c.getOptionalTreeField(3, "subtitle", QX2.class, 332901649));
                                                } else {
                                                    str14 = null;
                                                }
                                                if (c60476R0c.getOptionalTreeField(4, DevServerEntity.COLUMN_DESCRIPTION, C59093QWz.class, 156896729) != null) {
                                                    str15 = AbstractC58318PtA.A0h(c60476R0c.getOptionalTreeField(4, DevServerEntity.COLUMN_DESCRIPTION, C59093QWz.class, 156896729));
                                                } else {
                                                    str15 = null;
                                                }
                                                if (c60476R0c.getOptionalTreeField(7, "button_label", C59092QWy.class, 1139212346) != null) {
                                                    str16 = AbstractC58318PtA.A0h(c60476R0c.getOptionalTreeField(7, "button_label", C59092QWy.class, 1139212346));
                                                } else {
                                                    str16 = null;
                                                }
                                                ArrayList A1E = AbstractC166987dD.A1E();
                                                C1LC A0a2 = AbstractC58319PtB.A0a(c60476R0c, QX1.class, "error_messages", 8, -1396300020);
                                                while (A0a2.hasNext()) {
                                                    C2JS A0l = AbstractC25225BEi.A0l(A0a2);
                                                    if (A0l.getOptionalStringField(0, "text") != null) {
                                                        A1E.add(A0l.getOptionalStringField(0, "text"));
                                                    } else {
                                                        throw AbstractC166987dD.A12("The error message of PIN screen is null.");
                                                    }
                                                }
                                                List unmodifiableList2 = Collections.unmodifiableList(Collections.unmodifiableList(A1E));
                                                if (c60476R0c.getOptionalTreeField(6, "edit_text_field_title", QX0.class, -321601427) != null) {
                                                    str17 = AbstractC58318PtA.A0h(c60476R0c.getOptionalTreeField(6, "edit_text_field_title", QX0.class, -321601427));
                                                } else {
                                                    str17 = null;
                                                }
                                                if (c60476R0c.A0E() != null) {
                                                    str18 = AbstractC58320PtC.A0z(c60476R0c.A0E(), QTO.class, 8946366);
                                                }
                                                if (c60476R0c.A0E() != null && !TextUtils.isEmpty(AbstractC58320PtC.A0z(c60476R0c.A0E(), QTO.class, 8946366))) {
                                                    slh2 = C63337Shp.A02((QTO) c60476R0c.A0E().reinterpretRequired(0, QTO.class, 8946366));
                                                }
                                                if (!TextUtils.isEmpty(str13) && !TextUtils.isEmpty(str14) && !TextUtils.isEmpty(str15)) {
                                                    ?? obj7 = new Object();
                                                    obj7.A06 = str13;
                                                    obj7.A04 = str14;
                                                    obj7.A02 = str15;
                                                    obj7.A01 = str16;
                                                    obj7.A07 = unmodifiableList2;
                                                    obj7.A03 = str17;
                                                    obj7.A05 = str18;
                                                    obj7.A00 = slh2;
                                                    obj4 = obj7;
                                                    obj6 = obj4;
                                                } else {
                                                    throw AbstractC166987dD.A12("The title, subtitle and description of verification screen should NOT be empty.");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    C1LC A0a3 = AbstractC58319PtB.A0a(qs6, QS2.class, "dialog_screens", 2, -1524559062);
                                    while (true) {
                                        if (!A0a3.hasNext()) {
                                            break;
                                        }
                                        C2JS reinterpretRequired = AbstractC25225BEi.A0l(A0a3).reinterpretRequired(0, C58921QQj.class, -235391489);
                                        if (A002.getOptionalEnumField(2, TraceFieldType.ContentType, enumC72400Xcn) == reinterpretRequired.getOptionalEnumField(1, TraceFieldType.ContentType, enumC72400Xcn)) {
                                            ?? obj8 = new Object();
                                            if (reinterpretRequired.getOptionalTreeField(2, DialogModule.KEY_TITLE, C58920QQi.class, 807029164) != null) {
                                                str11 = AbstractC58318PtA.A0h(reinterpretRequired.getOptionalTreeField(2, DialogModule.KEY_TITLE, C58920QQi.class, 807029164));
                                            } else {
                                                str11 = null;
                                            }
                                            obj8.A02 = str11;
                                            if (reinterpretRequired.getOptionalTreeField(3, "subtitle", QQh.class, -681794596) != null) {
                                                str12 = AbstractC58318PtA.A0h(reinterpretRequired.getOptionalTreeField(3, "subtitle", QQh.class, -681794596));
                                            } else {
                                                str12 = null;
                                            }
                                            obj8.A01 = str12;
                                            if (reinterpretRequired.getOptionalTreeField(4, "option1", QQf.class, 1613778470) != null) {
                                                str19 = AbstractC58318PtA.A0h(reinterpretRequired.getOptionalTreeField(4, "option1", QQf.class, 1613778470));
                                            }
                                            obj8.A00 = str19;
                                            if (reinterpretRequired.getOptionalTreeField(5, "option2", QQg.class, -833039594) != null) {
                                                reinterpretRequired.getOptionalTreeField(5, "option2", QQg.class, -833039594).getOptionalStringField(0, "text");
                                            }
                                            obj6 = obj8.A00();
                                        }
                                    }
                                }
                            } else {
                                C1LC A0a4 = AbstractC58319PtB.A0a(qs6, QS4.class, "recovery_screens", 3, -1623445383);
                                while (A0a4.hasNext()) {
                                    C2JS reinterpretRequired2 = AbstractC25225BEi.A0l(A0a4).reinterpretRequired(0, QW4.class, 273585968);
                                    if (A002.getOptionalEnumField(2, TraceFieldType.ContentType, enumC72400Xcn) == reinterpretRequired2.getOptionalEnumField(1, TraceFieldType.ContentType, enumC72400Xcn)) {
                                        String str22 = null;
                                        if (reinterpretRequired2.getOptionalTreeField(2, DialogModule.KEY_TITLE, QW3.class, 1688352519) != null) {
                                            str7 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(2, DialogModule.KEY_TITLE, QW3.class, 1688352519));
                                        } else {
                                            str7 = null;
                                        }
                                        if (reinterpretRequired2.getOptionalTreeField(3, "subtitle", QW2.class, -904241881) != null) {
                                            str8 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(3, "subtitle", QW2.class, -904241881));
                                        } else {
                                            str8 = null;
                                        }
                                        if (reinterpretRequired2.getOptionalTreeField(4, DevServerEntity.COLUMN_DESCRIPTION, C59067QVz.class, -616724072) != null) {
                                            str9 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(4, DevServerEntity.COLUMN_DESCRIPTION, C59067QVz.class, -616724072));
                                        } else {
                                            str9 = null;
                                        }
                                        if (reinterpretRequired2.getOptionalTreeField(5, "action_text", C59066QVy.class, -521643067) != null) {
                                            str10 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(5, "action_text", C59066QVy.class, -521643067));
                                        } else {
                                            str10 = null;
                                        }
                                        String A03 = C63337Shp.A03(A002);
                                        if (reinterpretRequired2.getOptionalTreeField(7, "edit_field_hint", QW0.class, 1225063495) != null) {
                                            str20 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(7, "edit_field_hint", QW0.class, 1225063495));
                                        }
                                        if (reinterpretRequired2.getOptionalTreeField(6, "error_message", QW1.class, -52698336) != null) {
                                            str22 = AbstractC58318PtA.A0h(reinterpretRequired2.getOptionalTreeField(6, "error_message", QW1.class, -52698336));
                                        }
                                        if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str9)) {
                                            ?? obj9 = new Object();
                                            obj9.A06 = str7;
                                            obj9.A05 = str8;
                                            obj9.A01 = str9;
                                            obj9.A00 = str10;
                                            obj9.A04 = A03;
                                            obj9.A02 = str20;
                                            obj9.A03 = str22;
                                            obj4 = obj9;
                                            obj6 = obj4;
                                        } else {
                                            throw AbstractC166987dD.A12("The title, subtitle and description of PIN recovery screen should NOT be empty.");
                                        }
                                    }
                                }
                            }
                        } else {
                            C1LC A0a5 = AbstractC58319PtB.A0a(qs6, QS3.class, "pin_screens", 1, -1485869312);
                            while (true) {
                                if (!A0a5.hasNext()) {
                                    break;
                                }
                                R1Q r1q = (R1Q) AbstractC25225BEi.A0l(A0a5).reinterpretRequired(0, R1Q.class, -523897260);
                                r1q.getOptionalEnumField(1, TraceFieldType.ContentType, enumC72400Xcn).getClass();
                                if (A002.getOptionalEnumField(2, TraceFieldType.ContentType, enumC72400Xcn) == r1q.getOptionalEnumField(1, TraceFieldType.ContentType, enumC72400Xcn)) {
                                    ?? obj10 = new Object();
                                    SLH slh3 = null;
                                    if (r1q.getOptionalTreeField(2, DialogModule.KEY_TITLE, QWA.class, 629783011) != null) {
                                        str4 = AbstractC58318PtA.A0h(r1q.getOptionalTreeField(2, DialogModule.KEY_TITLE, QWA.class, 629783011));
                                    } else {
                                        str4 = null;
                                    }
                                    obj10.A06 = str4;
                                    if (r1q.getOptionalTreeField(3, "subtitle", QW8.class, -1766840138) != null) {
                                        str5 = AbstractC58318PtA.A0h(r1q.getOptionalTreeField(3, "subtitle", QW8.class, -1766840138));
                                    } else {
                                        str5 = null;
                                    }
                                    obj10.A05 = str5;
                                    if (r1q.A0E() != null) {
                                        str6 = AbstractC58320PtC.A0z(r1q.A0E(), QTO.class, 8946366);
                                    } else {
                                        str6 = null;
                                    }
                                    obj10.A03 = str6;
                                    if (r1q.A0E() != null && !TextUtils.isEmpty(AbstractC58320PtC.A0z(r1q.A0E(), QTO.class, 8946366))) {
                                        slh = C63337Shp.A02((QTO) r1q.A0E().reinterpretRequired(0, QTO.class, 8946366));
                                    } else {
                                        slh = null;
                                    }
                                    obj10.A00 = slh;
                                    ArrayList A1E2 = AbstractC166987dD.A1E();
                                    C1LC A0a6 = AbstractC58319PtB.A0a(r1q, QW7.class, "error_messages", 5, 1397580281);
                                    while (A0a6.hasNext()) {
                                        C2JS A0l2 = AbstractC25225BEi.A0l(A0a6);
                                        if (A0l2.getOptionalStringField(0, "text") != null) {
                                            A1E2.add(A0l2.getOptionalStringField(0, "text"));
                                        } else {
                                            throw AbstractC166987dD.A12("The error message of PIN screen is null.");
                                        }
                                    }
                                    obj10.A07 = Collections.unmodifiableList(Collections.unmodifiableList(A1E2));
                                    obj10.A02 = C63337Shp.A03(A002);
                                    if (r1q.getOptionalTreeField(6, "edit_text_field_title", QW6.class, 1525039633) != null) {
                                        str21 = AbstractC58318PtA.A0h(r1q.getOptionalTreeField(6, "edit_text_field_title", QW6.class, 1525039633));
                                    }
                                    obj10.A04 = str21;
                                    if (r1q.A0F() != null) {
                                        r1q.A0F().reinterpretRequired(0, QTO.class, 8946366).getOptionalStringField(0, "text");
                                    }
                                    if (r1q.A0F() != null && !TextUtils.isEmpty(AbstractC58320PtC.A0z(r1q.A0F(), QTO.class, 8946366))) {
                                        slh3 = C63337Shp.A02((QTO) r1q.A0F().reinterpretRequired(0, QTO.class, 8946366));
                                    }
                                    obj10.A01 = slh3;
                                    obj6 = obj10.A00();
                                }
                            }
                        }
                    }
                }
            }
        }
        C63337Shp c63337Shp = (C63337Shp) this.A01;
        if (obj6 != null) {
            str2 = "auth_flows_dynamic_content_display";
        } else {
            str2 = "auth_flows_local_content_display";
        }
        String string7 = c61549RpU.A00.getString("BUNDLE_KEY_PAYMENT_TYPE");
        Throwable th = c63406Sjd.A02;
        Object obj11 = this.A03;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("logger_data", obj11);
        if (th != null) {
            A1G.put("throwable", th);
        }
        A1G.put("product", string7);
        c63337Shp.A00.Chz(str2, A1G);
        if (obj6 != null) {
            return obj6;
        }
        SCP scp = c63337Shp.A01;
        String string8 = c61549RpU.A00.getString("BUNDLE_KEY_PRIMARY_FLOW_TYPE");
        switch (string4.hashCode()) {
            case -1796307114:
                if (string4.equals("CONFIRM_PIN")) {
                    q1y = scp.A00;
                    singletonList = Collections.singletonList(q1y.getString(2131962242));
                    if (!"PIN_LOCKED".equals(string) && !"FORGOT_PIN".equals(string) && !"CHANGE_PIN_USING_OLD_PIN".equals(string8)) {
                        ?? obj12 = new Object();
                        A01(q1y, obj12);
                        i2 = 2131962244;
                        c62699SMn5 = obj12;
                        c62699SMn5.A05 = q1y.getString(i2);
                        i = 2131962253;
                        c62699SMn4 = c62699SMn5;
                        c62699SMn4.A03 = q1y.getString(i);
                        c62699SMn3 = c62699SMn4;
                        unmodifiableList = Collections.unmodifiableList(singletonList);
                        c62699SMn2 = c62699SMn3;
                        c62699SMn2.A07 = unmodifiableList;
                        c62699SMn6 = c62699SMn2;
                        c62699SMn6.A04 = q1y.getString(2131953339);
                        return c62699SMn6.A00();
                    }
                    ?? obj13 = new Object();
                    A01(q1y, obj13);
                    obj13.A05 = q1y.getString(2131962243);
                    i = 2131962255;
                    c62699SMn4 = obj13;
                    c62699SMn4.A03 = q1y.getString(i);
                    c62699SMn3 = c62699SMn4;
                    unmodifiableList = Collections.unmodifiableList(singletonList);
                    c62699SMn2 = c62699SMn3;
                    c62699SMn2.A07 = unmodifiableList;
                    c62699SMn6 = c62699SMn2;
                    c62699SMn6.A04 = q1y.getString(2131953339);
                    return c62699SMn6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case -1523000326:
                if (string4.equals("RECOVER_PIN")) {
                    boolean equals4 = "FORGOT_PIN".equals(string);
                    Q1y q1y4 = scp.A00;
                    if (equals4) {
                        string2 = q1y4.getString(2131962280);
                        i3 = 2131962262;
                    } else {
                        string2 = q1y4.getString(2131962280);
                        i3 = 2131962281;
                    }
                    String string9 = q1y4.getString(i3);
                    String string10 = q1y4.getString(2131962284);
                    String string11 = q1y4.getString(2131962282);
                    String string12 = q1y4.getString(2131962283);
                    String string13 = q1y4.getString(2131962285);
                    String string14 = q1y4.getString(2131962286);
                    if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string9) && !TextUtils.isEmpty(string10)) {
                        ?? obj14 = new Object();
                        obj14.A06 = string2;
                        obj14.A05 = string9;
                        obj14.A01 = string10;
                        obj14.A00 = string11;
                        obj14.A04 = string12;
                        obj14.A02 = string13;
                        obj14.A03 = string14;
                        return obj14;
                    }
                    throw AbstractC166987dD.A12("The title, subtitle and description of PIN recovery screen should NOT be empty.");
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case -546650078:
                if (string4.equals("VERIFY_BIO")) {
                    if ("VERIFY_BIO_TO_DISABLE_BIO_HUB".equals(string8)) {
                        ?? obj15 = new Object();
                        q1y2 = scp.A00;
                        A00(q1y2, obj15, 2131962261);
                        i4 = 2131962260;
                        slx = obj15;
                    } else {
                        boolean equals5 = "VERIFY_BIO_TO_PAY".equals(string8);
                        ?? obj16 = new Object();
                        q1y2 = scp.A00;
                        if (equals5) {
                            A00(q1y2, obj16, 2131962306);
                            i4 = 2131962305;
                            slx = obj16;
                        } else {
                            A00(q1y2, obj16, 2131962304);
                            string3 = q1y2.getString(2131962303);
                            slx8 = obj16;
                            slx8.A01 = string3;
                            i5 = 2131962289;
                            slx7 = slx8;
                            slx7.A00 = q1y2.getString(i5);
                            slx6 = slx7;
                            return slx6.A00();
                        }
                    }
                    slx.A01 = q1y2.getString(i4);
                    i5 = 2131962290;
                    slx7 = slx;
                    slx7.A00 = q1y2.getString(i5);
                    slx6 = slx7;
                    return slx6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case -546648707:
                if (string4.equals("VERIFY_CVV")) {
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    W4W w4w = new W4W();
                    w4w.A01("https://www.facebook.com/help/pay?ref=learn_more");
                    w4w.A01 = 2131961505;
                    w4w.A03 = "[[payment_terms_token]]";
                    A1E3.add(new LinkParams(w4w));
                    Q1y q1y5 = scp.A00;
                    A00 = SSE.A00(q1y5, ImmutableList.copyOf((Collection) A1E3), q1y5.getString(2131962257));
                    str3 = null;
                    String string15 = q1y5.getString(2131962280);
                    String string16 = q1y5.getString(2131962310);
                    String string17 = q1y5.getString(2131962256);
                    String string18 = q1y5.getString(2131962308);
                    String string19 = q1y5.getString(2131962307);
                    List unmodifiableList3 = Collections.unmodifiableList(Collections.singletonList(q1y5.getString(2131962309)));
                    if (!TextUtils.isEmpty(string15) && !TextUtils.isEmpty(string16) && !TextUtils.isEmpty(string17)) {
                        ?? obj17 = new Object();
                        obj17.A06 = string15;
                        obj17.A04 = string16;
                        obj17.A02 = string17;
                        obj17.A01 = string19;
                        obj17.A07 = unmodifiableList3;
                        obj17.A03 = string18;
                        c61574Rpx = obj17;
                        c61574Rpx.A05 = str3;
                        c61574Rpx.A00 = A00;
                        return c61574Rpx;
                    }
                    throw AbstractC166987dD.A12("The title, subtitle and description of verification screen should NOT be empty.");
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case -546636625:
                if (string4.equals("VERIFY_PIN")) {
                    if (!"CHANGE_PIN_USING_OLD_PIN".equals(string8) && !"VERIFY_PIN_TO_PAY".equals(string8)) {
                        if (!"CONNECT_FROM_HUB_PIN_VERIFICATION".equals(string8) && !"CONNECT_FROM_CHECKOUT_PIN_VERIFICATION".equals(string8)) {
                            ?? obj18 = new Object();
                            q1y = scp.A00;
                            A01(q1y, obj18);
                            obj18.A05 = q1y.getString(2131962319);
                            obj18.A03 = q1y.getString(2131962317);
                            obj18.A02 = q1y.getString(2131962316);
                            i7 = 2131962318;
                            c62699SMn = obj18;
                        } else {
                            ?? obj19 = new Object();
                            q1y = scp.A00;
                            A01(q1y, obj19);
                            obj19.A05 = q1y.getString(2131962315);
                            obj19.A03 = q1y.getString(2131962245);
                            i7 = 2131962314;
                            c62699SMn = obj19;
                        }
                        singletonList = Collections.singletonList(q1y.getString(i7));
                        c62699SMn3 = c62699SMn;
                        unmodifiableList = Collections.unmodifiableList(singletonList);
                        c62699SMn2 = c62699SMn3;
                        c62699SMn2.A07 = unmodifiableList;
                        c62699SMn6 = c62699SMn2;
                        c62699SMn6.A04 = q1y.getString(2131953339);
                        return c62699SMn6.A00();
                    }
                    ArrayList A1E4 = AbstractC166987dD.A1E();
                    q1y = scp.A00;
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962323);
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962324);
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962327);
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962325);
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962322);
                    AbstractC31173DnH.A17(q1y, A1E4, 2131962326);
                    ?? obj20 = new Object();
                    A01(q1y, obj20);
                    obj20.A05 = q1y.getString(2131962319);
                    boolean equals6 = "VERIFY_PIN_TO_PAY".equals(string8);
                    boolean A1O = AbstractC58319PtB.A1O();
                    if (equals6) {
                        i6 = 2131962321;
                        if (A1O) {
                            i6 = 2131966642;
                        }
                    } else {
                        i6 = 2131962320;
                        if (A1O) {
                            i6 = 2131966641;
                        }
                    }
                    obj20.A03 = q1y.getString(i6);
                    obj20.A02 = q1y.getString(2131962316);
                    unmodifiableList = Collections.unmodifiableList(Collections.unmodifiableList(A1E4));
                    c62699SMn2 = obj20;
                    c62699SMn2.A07 = unmodifiableList;
                    c62699SMn6 = c62699SMn2;
                    c62699SMn6.A04 = q1y.getString(2131953339);
                    return c62699SMn6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case 1374462462:
                if (string4.equals("PIN_CREATED")) {
                    q1y = scp.A00;
                    singletonList = Collections.singletonList(q1y.getString(2131962242));
                    if (!"PIN_LOCKED".equals(string) && !"FORGOT_PIN".equals(string) && !"CHANGE_PIN_USING_OLD_PIN".equals(string8)) {
                        ?? obj21 = new Object();
                        A01(q1y, obj21);
                        i2 = 2131962278;
                        c62699SMn5 = obj21;
                        c62699SMn5.A05 = q1y.getString(i2);
                        i = 2131962253;
                        c62699SMn4 = c62699SMn5;
                        c62699SMn4.A03 = q1y.getString(i);
                        c62699SMn3 = c62699SMn4;
                        unmodifiableList = Collections.unmodifiableList(singletonList);
                        c62699SMn2 = c62699SMn3;
                        c62699SMn2.A07 = unmodifiableList;
                        c62699SMn6 = c62699SMn2;
                        c62699SMn6.A04 = q1y.getString(2131953339);
                        return c62699SMn6.A00();
                    }
                    ?? obj22 = new Object();
                    A01(q1y, obj22);
                    obj22.A05 = q1y.getString(2131962243);
                    i = 2131962277;
                    c62699SMn4 = obj22;
                    c62699SMn4.A03 = q1y.getString(i);
                    c62699SMn3 = c62699SMn4;
                    unmodifiableList = Collections.unmodifiableList(singletonList);
                    c62699SMn2 = c62699SMn3;
                    c62699SMn2.A07 = unmodifiableList;
                    c62699SMn6 = c62699SMn2;
                    c62699SMn6.A04 = q1y.getString(2131953339);
                    return c62699SMn6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case 1657309561:
                if (string4.equals("VERIFY_PAYPAL")) {
                    A00 = null;
                    Q1y q1y6 = scp.A00;
                    String string20 = q1y6.getString(2131962280);
                    String string21 = q1y6.getString(2131962313);
                    String string22 = q1y6.getString(2131962312);
                    str3 = q1y6.getString(2131962276);
                    String string23 = q1y6.getString(2131962311);
                    if (!TextUtils.isEmpty(string20) && !TextUtils.isEmpty(string21) && !TextUtils.isEmpty(string22)) {
                        ?? obj23 = new Object();
                        obj23.A06 = string20;
                        obj23.A04 = string21;
                        obj23.A02 = string22;
                        obj23.A01 = string23;
                        obj23.A07 = null;
                        obj23.A03 = null;
                        c61574Rpx = obj23;
                        c61574Rpx.A05 = str3;
                        c61574Rpx.A00 = A00;
                        return c61574Rpx;
                    }
                    throw AbstractC166987dD.A12("The title, subtitle and description of verification screen should NOT be empty.");
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case 1840465042:
                if (string4.equals("CONFIRMATION_DIALOG")) {
                    if ("CANCEL_OUT_OF_FLOW".equals(string)) {
                        if (!"CONNECT_FROM_HUB_PIN_VERIFICATION".equals(string8) && !"CONNECT_FROM_CHECKOUT_PIN_VERIFICATION".equals(string8)) {
                            if (!"CONNECT_FROM_HUB_CVV_VERIFICATION".equals(string8) && !"CONNECT_FROM_CHECKOUT_CVV_VERIFICATION".equals(string8)) {
                                if (!"CONNECT_FROM_HUB_PAYPAL_VERIFICATION".equals(string8) && !"CONNECT_FROM_CHECKOUT_PAYPAL_VERIFICATION".equals(string8)) {
                                    ?? obj24 = new Object();
                                    q1y3 = scp.A00;
                                    A00(q1y3, obj24, 2131962265);
                                    obj24.A01 = q1y3.getString(2131962264);
                                    obj24.A00 = q1y3.getString(2131962281);
                                    i9 = 2131962288;
                                    slx4 = obj24;
                                    q1y3.getString(i9);
                                    slx6 = slx4;
                                } else {
                                    ?? obj25 = new Object();
                                    q1y3 = scp.A00;
                                    A00(q1y3, obj25, 2131962275);
                                    obj25.A01 = q1y3.getString(2131962274);
                                    i8 = 2131962273;
                                    slx3 = obj25;
                                    slx3.A00 = q1y3.getString(i8);
                                    i9 = 2131962259;
                                    slx4 = slx3;
                                    q1y3.getString(i9);
                                    slx6 = slx4;
                                }
                            } else {
                                ?? obj26 = new Object();
                                q1y3 = scp.A00;
                                A00(q1y3, obj26, 2131962268);
                                obj26.A01 = q1y3.getString(2131962267);
                                i11 = 2131962266;
                                slx5 = obj26;
                            }
                        } else {
                            ?? obj27 = new Object();
                            q1y3 = scp.A00;
                            A00(q1y3, obj27, 2131962272);
                            obj27.A01 = q1y3.getString(2131962271);
                            i11 = 2131962270;
                            slx5 = obj27;
                        }
                        slx5.A00 = q1y3.getString(i11);
                        i9 = 2131962269;
                        slx4 = slx5;
                        q1y3.getString(i9);
                        slx6 = slx4;
                    } else {
                        if ("VERIFY_PIN_TO_DISABLE_PIN_HUB".equals(string8)) {
                            throw AbstractC166987dD.A18("Not implemented yet!");
                        }
                        if ("UNABLE_TO_CONNECT_FROM_CHECKOUT".equals(string8)) {
                            ?? obj28 = new Object();
                            q1y2 = scp.A00;
                            A00(q1y2, obj28, 2131962300);
                            i10 = 2131962301;
                            slx2 = obj28;
                        } else if ("UNABLE_TO_CONNECT_FROM_HUB".equals(string8)) {
                            ?? obj29 = new Object();
                            q1y2 = scp.A00;
                            A00(q1y2, obj29, 2131962300);
                            i10 = 2131962302;
                            slx2 = obj29;
                        } else {
                            if (!"CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG".equals(string8) && !"CONNECT_WITH_CVV_AFTER_PIN_FAILURE_FROM_HUB_DIALOG".equals(string8)) {
                                if (!"CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_CHECKOUT_DIALOG".equals(string8) && !"CONNECT_WITH_PAYPAL_AFTER_PIN_FAILURE_FROM_HUB_DIALOG".equals(string8)) {
                                    ?? obj30 = new Object();
                                    q1y3 = scp.A00;
                                    A00(q1y3, obj30, 2131962299);
                                    obj30.A01 = q1y3.getString(2131962298);
                                    obj30.A00 = q1y3.getString(2131962252);
                                    i9 = 2131962287;
                                    slx4 = obj30;
                                    q1y3.getString(i9);
                                    slx6 = slx4;
                                } else {
                                    ?? obj31 = new Object();
                                    q1y3 = scp.A00;
                                    A00(q1y3, obj31, 2131962251);
                                    obj31.A01 = q1y3.getString(2131962250);
                                    i8 = 2131962249;
                                    slx3 = obj31;
                                }
                            } else {
                                ?? obj32 = new Object();
                                q1y3 = scp.A00;
                                A00(q1y3, obj32, 2131962247);
                                obj32.A01 = q1y3.getString(2131962246);
                                i8 = 2131962248;
                                slx3 = obj32;
                            }
                            slx3.A00 = q1y3.getString(i8);
                            i9 = 2131962259;
                            slx4 = slx3;
                            q1y3.getString(i9);
                            slx6 = slx4;
                        }
                        slx2.A01 = q1y2.getString(i10);
                        i5 = 2131953336;
                        slx7 = slx2;
                        slx7.A00 = q1y2.getString(i5);
                        slx6 = slx7;
                    }
                    return slx6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case 1855579941:
                if (string4.equals("CREATE_BIO")) {
                    ?? obj33 = new Object();
                    q1y2 = scp.A00;
                    A00(q1y2, obj33, 2131962304);
                    string3 = q1y2.getString(2131962303);
                    slx8 = obj33;
                    slx8.A01 = string3;
                    i5 = 2131962289;
                    slx7 = slx8;
                    slx7.A00 = q1y2.getString(i5);
                    slx6 = slx7;
                    return slx6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            case 1855593394:
                if (string4.equals("CREATE_PIN")) {
                    if (!"PIN_LOCKED".equals(string) && !"FORGOT_PIN".equals(string)) {
                        boolean equals7 = "CHANGE_PIN_USING_OLD_PIN".equals(string8);
                        ?? obj34 = new Object();
                        q1y = scp.A00;
                        if (equals7) {
                            A01(q1y, obj34);
                            i12 = 2131962254;
                            c62699SMn8 = obj34;
                        } else {
                            A01(q1y, obj34);
                            obj34.A05 = q1y.getString(2131962252);
                            i13 = 2131962253;
                            c62699SMn7 = obj34;
                            c62699SMn7.A03 = q1y.getString(i13);
                            c62699SMn6 = c62699SMn7;
                            c62699SMn6.A04 = q1y.getString(2131953339);
                            return c62699SMn6.A00();
                        }
                    } else {
                        ?? obj35 = new Object();
                        q1y = scp.A00;
                        A01(q1y, obj35);
                        i12 = 2131962281;
                        c62699SMn8 = obj35;
                    }
                    c62699SMn8.A05 = q1y.getString(i12);
                    i13 = 2131962255;
                    c62699SMn7 = c62699SMn8;
                    c62699SMn7.A03 = q1y.getString(i13);
                    c62699SMn6 = c62699SMn7;
                    c62699SMn6.A04 = q1y.getString(2131953339);
                    return c62699SMn6.A00();
                }
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
            default:
                throw AbstractC167007dF.A0c("Unsupported authentication step type:", string4);
        }
    }

    public static void A00(Context context, SLX slx, int i) {
        slx.A02 = context.getString(i);
    }

    public static void A01(Context context, C62699SMn c62699SMn) {
        c62699SMn.A06 = context.getString(2131962280);
    }
}
