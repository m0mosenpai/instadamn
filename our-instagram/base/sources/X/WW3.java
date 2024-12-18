package X;

import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.venue.Venue;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class WW3 implements InterfaceC48192Ji {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WW3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        List build;
        Object Bos;
        VFJ vfj;
        C2JS c2js;
        Integer num;
        String str;
        boolean z;
        AbstractC907342m abstractC907342m;
        AbstractC907342m A00;
        AbstractC907342m A002;
        AbstractC907342m A003;
        String str2;
        AbstractC907342m A004;
        ImmutableList A02;
        switch (this.A00) {
            case 0:
                if (anonymousClass436 == null) {
                    ((XC3) this.A01).onFailure(new Throwable("Empty OHAI Config Result"));
                    return;
                }
                Object obj = (C2JT) anonymousClass436.Bos();
                if (obj == null) {
                    ((XC3) this.A01).onFailure(new Throwable("Empty OHAI Config Response"));
                    return;
                }
                AbstractC69586Vrp abstractC69586Vrp = (AbstractC69586Vrp) this.A02;
                C2JS c2js2 = (C2JS) obj;
                C14360o3.A0B(c2js2, 0);
                if (c2js2.getOptionalTreeField(0, "xfb_ohai_configurations", C66962Udx.class, 1035517138) == null) {
                    build = C16930sl.A00;
                } else {
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    C2JS optionalTreeField = c2js2.getOptionalTreeField(0, "xfb_ohai_configurations", C66962Udx.class, 1035517138);
                    if (optionalTreeField != null) {
                        C1LC A0I = AbstractC43592JPx.A0I(optionalTreeField.getRequiredCompactedTreeListField(0, "ohai_configs", C66961Udw.class, 354115122));
                        while (A0I.hasNext()) {
                            C2JS c2js3 = (C2JS) A0I.next();
                            if (c2js3.hasFieldValue("key_id") && c2js3.A08("public_key") != null && c2js3.hasFieldValue("kem_id") && c2js3.hasFieldValue("kdf_id") && c2js3.hasFieldValue("aead_id") && c2js3.A0C("expiration_date") != null) {
                                String A005 = AbstractC111324zv.A00(465);
                                if (c2js3.getOptionalStringField(6, A005) != null) {
                                    int coercedIntField = c2js3.getCoercedIntField(0, "key_id");
                                    String A08 = c2js3.A08("public_key");
                                    if (A08 != null) {
                                        int A006 = c2js3.A00("kem_id");
                                        int coercedIntField2 = c2js3.getCoercedIntField(3, "kdf_id");
                                        int coercedIntField3 = c2js3.getCoercedIntField(4, "aead_id");
                                        String A0C = c2js3.A0C("expiration_date");
                                        if (A0C != null) {
                                            long parseLong = Long.parseLong(A0C);
                                            String optionalStringField = c2js3.getOptionalStringField(6, A005);
                                            if (optionalStringField != null) {
                                                builder.add((Object) new OHAIConfig(A08, coercedIntField, A006, coercedIntField2, coercedIntField3, parseLong, Long.parseLong(optionalStringField)));
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                }
                            }
                            C0K8.A0C("IGDirectOHAIConfigFetcher", "Missing required fields in OHAI Config");
                        }
                        build = builder.build();
                        C14360o3.A07(build);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (build.isEmpty()) {
                    ((XC3) this.A01).onFailure(new Throwable("No OHAI Configs returned from server"));
                    return;
                }
                Object obj2 = build.get(0);
                for (OHAIConfig oHAIConfig : AbstractC001800i.A0c(build, 1)) {
                    if (oHAIConfig.A04 > ((OHAIConfig) obj2).A04) {
                        obj2 = oHAIConfig;
                    }
                }
                OHAIConfig oHAIConfig2 = (OHAIConfig) obj2;
                if (oHAIConfig2.A04 * 1000 < System.currentTimeMillis()) {
                    ((XC3) this.A01).onFailure(new Throwable("Latest OHAI Config is already expired"));
                    return;
                }
                String A022 = AbstractC73763Sg.A03.A02(obj2, C71735X0a.A00);
                C1ZT AR9 = abstractC69586Vrp.A00.AR9();
                AR9.A09("ohai_config", A022);
                if (!AR9.A0B()) {
                    C0K8.A0C("OHAIConfigFetcherBase", "Failed to write OHAI Config to local storage");
                }
                ((XC3) this.A01).Dpm(oHAIConfig2, true);
                return;
            case 1:
                if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null) {
                    vfj = (VFJ) c2js.getOptionalEnumField(0, "fetch_attribution_event_compliance_action(consent_type:\"OTHER_COMPANY_TRACKERS_ON_FOA\")", VFJ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    if (vfj != null) {
                        int ordinal = vfj.ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 2) {
                                if (ordinal == 1) {
                                    num = C05F.A0C;
                                }
                            } else {
                                num = C05F.A01;
                            }
                        } else {
                            num = C05F.A00;
                        }
                        VgY vgY = (VgY) this.A01;
                        W4T w4t = vgY.A01;
                        C70151W8r c70151W8r = w4t.A04;
                        switch (num.intValue()) {
                            case 0:
                                str = "REPORT";
                                break;
                            case 1:
                                str = "IGNORE";
                                break;
                            default:
                                str = "BUFFER";
                                break;
                        }
                        List list = vgY.A00;
                        C14360o3.A0B(list, 2);
                        C70151W8r.A01(C70151W8r.A00("get_compliance_action_success", str, null, list), "info", c70151W8r);
                        if (num == C05F.A00) {
                            z = false;
                        } else {
                            if (num != C05F.A0C) {
                                return;
                            }
                            C70151W8r.A01(C70151W8r.A00("buffer_events", "server_side", null, list), "info", c70151W8r);
                            z = true;
                        }
                        W4T.A00(list, w4t, z);
                        return;
                    }
                } else {
                    vfj = null;
                }
                C0w9.A03("attribution_sdk:GraphQLAttributionEventComplianceActionProvider", AbstractC167017dG.A0n(vfj, "Unsupported compliance action: ", new StringBuilder()));
                VgY vgY2 = (VgY) this.A01;
                String A0n = AbstractC167017dG.A0n(vfj, "Unsupported compliance action: ", new StringBuilder());
                C14360o3.A0B(A0n, 0);
                C70151W8r.A01(C70151W8r.A00("get_compliance_action_failure", A0n, null, vgY2.A00), "error", vgY2.A01.A04);
                return;
            case 2:
                if (anonymousClass436 == null || (abstractC907342m = (AbstractC907342m) anonymousClass436.Bos()) == null || (A00 = abstractC907342m.A00(UNU.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER)) == null || (A002 = A00.A00(UNT.class, "business_manager")) == null || (A003 = A002.A00(UNS.class, AbstractC111324zv.A00(471))) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                C1LC A0I2 = AbstractC43592JPx.A0I(A003.A02("edges", UNQ.class));
                while (true) {
                    boolean z2 = false;
                    if (A0I2.hasNext()) {
                        AbstractC907342m A007 = ((AbstractC907342m) A0I2.next()).A00(UNP.class, "node");
                        String str3 = null;
                        if (A007 != null) {
                            String A05 = A007.A05("instagram_media_id");
                            AbstractC907342m A008 = A007.A00(UNL.class, "image");
                            if (A008 != null) {
                                str3 = A008.A05("uri");
                            }
                            Enum A04 = A007.A04("instagram_media_type", VFL.A02);
                            double d = 0.0d;
                            if (A05 != null && str3 != null && A04 != null) {
                                AbstractC907342m A009 = A007.A00(UNO.class, "inline_insights_node");
                                if (A009 != null && (A004 = A009.A00(UNN.class, "metric_single_value_query")) != null && (A02 = A004.A02("results", UNM.class)) != null && (!A02.isEmpty())) {
                                    d = ((AbstractC907342m) A02.get(0)).A00.optDouble("total_value");
                                }
                                SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str3);
                                VDG valueOf = VDG.valueOf(AbstractC166987dD.A19(A04));
                                if (A007.A00(UNK.class, "ad_media") != null) {
                                    z2 = true;
                                }
                                arrayList.add(new C69282Vkq(valueOf, simpleImageUrl, Boolean.valueOf(z2), A05, (int) d));
                            }
                        }
                    } else {
                        AbstractC907342m A0010 = A003.A00(UNR.class, "page_info");
                        if (A0010 == null || (str2 = A0010.A05("end_cursor")) == null) {
                            str2 = "";
                        }
                        AbstractC907342m A0011 = A003.A00(UNR.class, "page_info");
                        if (A0011 != null) {
                            z2 = A0011.A06("has_next_page");
                        }
                        C69575Vre c69575Vre = new C69575Vre(str2, arrayList, z2);
                        XDK xdk = (XDK) this.A01;
                        W6j.A01(xdk, c69575Vre);
                        W6j.A00(xdk);
                        return;
                    }
                }
                break;
            case 3:
                V17 v17 = (V17) this.A02;
                View view = v17.mView;
                if (view == null) {
                    return;
                }
                view.post(new RunnableC71574WwR(anonymousClass436, v17, (List) this.A01));
                return;
            case 4:
                C58444PvN c58444PvN = (C58444PvN) this.A01;
                InterfaceC48212Jk interfaceC48212Jk = (InterfaceC48212Jk) this.A02;
                if (anonymousClass436 != null && (Bos = anonymousClass436.Bos()) != null) {
                    c58444PvN.A03(SSG.A00(S9X.A02.apply(Bos)));
                    return;
                } else {
                    interfaceC48212Jk.invoke(new RuntimeException(AbstractC58317Pt9.A00(181)));
                    return;
                }
            default:
                V1B v1b = (V1B) this.A01;
                v1b.A0E = VVH.A00(anonymousClass436, ((Venue) this.A02).A05());
                v1b.A07.A09(V1B.A00(v1b));
                return;
        }
    }
}
