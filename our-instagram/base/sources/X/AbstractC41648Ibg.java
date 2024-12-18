package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CreatorViewerBottomCTA;
import com.instagram.api.schemas.CreatorViewerBottomCTAImpl;
import com.instagram.api.schemas.CreatorViewerBottomCTAType;
import com.instagram.api.schemas.CreatorViewerContextCTA;
import com.instagram.api.schemas.CreatorViewerContextCTAImpl;
import com.instagram.api.schemas.CreatorViewerContextCTATarget;
import com.instagram.api.schemas.CreatorViewerContextCTAType;
import com.instagram.api.schemas.CreatorViewerInsightInfo;
import com.instagram.api.schemas.CreatorViewerInsightInfoImpl;
import com.instagram.api.schemas.CreatorViewerInsightTypeV2;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetails;
import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetails;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalInfo;
import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalModel;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetails;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfo;
import com.instagram.api.schemas.CreatorViewerSignalWithInsightsInfoImpl;
import com.instagram.api.schemas.FormattedString;
import com.instagram.api.schemas.InspirationSignalType;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41648Ibg {
    public static H30 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerBottomCTAImpl creatorViewerBottomCTAImpl = null;
            ArrayList arrayList = null;
            CreatorViewerContextCTAImpl creatorViewerContextCTAImpl = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bottom_cta".equals(A0s)) {
                    creatorViewerBottomCTAImpl = AbstractC39867HmG.parseFromJson(c16l);
                } else if ("bottom_cta_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            CreatorViewerBottomCTAImpl parseFromJson = AbstractC39867HmG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("context_cta".equals(A0s)) {
                    creatorViewerContextCTAImpl = AbstractC39869HmI.parseFromJson(c16l);
                } else if ("signal_with_insights_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            CreatorViewerSignalWithInsightsInfoImpl parseFromJson2 = AbstractC39888Hmb.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("signals".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            CreatorViewerSignalModelImpl parseFromJson3 = AbstractC39882HmV.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("bottom_cta_list", c16l, "CreatorViewerInsightV2Impl");
            } else if (arrayList2 != null || !(c16l instanceof C07950bF)) {
                if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("signals", c16l, "CreatorViewerInsightV2Impl");
                } else {
                    return new H30(creatorViewerBottomCTAImpl, creatorViewerContextCTAImpl, str, arrayList, arrayList2, arrayList3);
                }
            } else {
                AbstractC166997dE.A1V("signal_with_insights_list", c16l, "CreatorViewerInsightV2Impl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H30 h30) {
        anonymousClass182.A0d();
        CreatorViewerBottomCTA creatorViewerBottomCTA = h30.A00;
        if (creatorViewerBottomCTA != null) {
            anonymousClass182.A0r("bottom_cta");
            CreatorViewerBottomCTAImpl Esl = creatorViewerBottomCTA.Esl();
            anonymousClass182.A0d();
            CreatorViewerBottomCTAType creatorViewerBottomCTAType = Esl.A00;
            if (creatorViewerBottomCTAType != null) {
                anonymousClass182.A0S("bottom_cta_type", creatorViewerBottomCTAType.A00);
            }
            AbstractC37301Gc2.A1E(anonymousClass182, Esl.A01);
            anonymousClass182.A0a();
        }
        List list = h30.A03;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "bottom_cta_list", list);
            while (A0q.hasNext()) {
                CreatorViewerBottomCTA creatorViewerBottomCTA2 = (CreatorViewerBottomCTA) A0q.next();
                if (creatorViewerBottomCTA2 != null) {
                    CreatorViewerBottomCTAImpl Esl2 = creatorViewerBottomCTA2.Esl();
                    anonymousClass182.A0d();
                    CreatorViewerBottomCTAType creatorViewerBottomCTAType2 = Esl2.A00;
                    if (creatorViewerBottomCTAType2 != null) {
                        anonymousClass182.A0S("bottom_cta_type", creatorViewerBottomCTAType2.A00);
                    }
                    AbstractC37301Gc2.A1E(anonymousClass182, Esl2.A01);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        CreatorViewerContextCTA creatorViewerContextCTA = h30.A01;
        if (creatorViewerContextCTA != null) {
            anonymousClass182.A0r("context_cta");
            CreatorViewerContextCTAImpl Esm = creatorViewerContextCTA.Esm();
            anonymousClass182.A0d();
            CreatorViewerContextCTAType creatorViewerContextCTAType = Esm.A01;
            if (creatorViewerContextCTAType != null) {
                anonymousClass182.A0S("context_cta_type", creatorViewerContextCTAType.A00);
            }
            CreatorViewerContextCTATarget creatorViewerContextCTATarget = Esm.A00;
            if (creatorViewerContextCTATarget != null) {
                anonymousClass182.A0S("cta_target", creatorViewerContextCTATarget.A00);
            }
            FormattedString formattedString = Esm.A02;
            if (formattedString != null) {
                A01(anonymousClass182, formattedString, "extended_text");
            }
            FormattedString formattedString2 = Esm.A03;
            if (formattedString2 != null) {
                A01(anonymousClass182, formattedString2, "formatted_text");
            }
            String str = Esm.A04;
            if (str != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str);
            }
            AbstractC37301Gc2.A1E(anonymousClass182, Esm.A05);
            anonymousClass182.A0a();
        }
        List list2 = h30.A04;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "signal_with_insights_list", list2);
            while (A0q2.hasNext()) {
                CreatorViewerSignalWithInsightsInfo creatorViewerSignalWithInsightsInfo = (CreatorViewerSignalWithInsightsInfo) A0q2.next();
                if (creatorViewerSignalWithInsightsInfo != null) {
                    CreatorViewerSignalWithInsightsInfoImpl Et0 = creatorViewerSignalWithInsightsInfo.Et0();
                    anonymousClass182.A0d();
                    String str2 = Et0.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str2);
                    }
                    String str3 = Et0.A02;
                    if (str3 != null) {
                        anonymousClass182.A0S("image", str3);
                    }
                    List list3 = Et0.A03;
                    if (list3 != null) {
                        Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "insights", list3);
                        while (A0q3.hasNext()) {
                            CreatorViewerInsightInfo creatorViewerInsightInfo = (CreatorViewerInsightInfo) A0q3.next();
                            if (creatorViewerInsightInfo != null) {
                                CreatorViewerInsightInfoImpl Eso = creatorViewerInsightInfo.Eso();
                                anonymousClass182.A0d();
                                FormattedString formattedString3 = Eso.A01;
                                if (formattedString3 != null) {
                                    A01(anonymousClass182, formattedString3, "formatted_text");
                                }
                                CreatorViewerInsightTypeV2 creatorViewerInsightTypeV2 = Eso.A00;
                                if (creatorViewerInsightTypeV2 != null) {
                                    anonymousClass182.A0S("insight_type_v2", creatorViewerInsightTypeV2.A00);
                                }
                                AbstractC37301Gc2.A1E(anonymousClass182, Eso.A02);
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    CreatorViewerSignalInfo creatorViewerSignalInfo = Et0.A00;
                    if (creatorViewerSignalInfo != null) {
                        anonymousClass182.A0r("signal");
                        CreatorViewerSignalInfoImpl Esv = creatorViewerSignalInfo.Esv();
                        anonymousClass182.A0d();
                        CreatorViewerSignalType creatorViewerSignalType = Esv.A00;
                        if (creatorViewerSignalType != null) {
                            anonymousClass182.A0S("signal_type", creatorViewerSignalType.A00);
                        }
                        AbstractC37301Gc2.A1E(anonymousClass182, Esv.A01);
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List list4 = h30.A05;
        if (list4 != null) {
            Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "signals", list4);
            while (A0q4.hasNext()) {
                CreatorViewerSignalModel creatorViewerSignalModel = (CreatorViewerSignalModel) A0q4.next();
                if (creatorViewerSignalModel != null) {
                    CreatorViewerSignalModelImpl Esx = creatorViewerSignalModel.Esx(new C37761pD(null));
                    anonymousClass182.A0d();
                    CreatorViewerSignalDetails creatorViewerSignalDetails = Esx.A00;
                    if (creatorViewerSignalDetails != null) {
                        anonymousClass182.A0r("details");
                        CreatorViewerSignalDetailsImpl Esu = creatorViewerSignalDetails.Esu(new C37761pD(null));
                        anonymousClass182.A0d();
                        CreatorViewerSignalAudioDetails creatorViewerSignalAudioDetails = Esu.A00;
                        if (creatorViewerSignalAudioDetails != null) {
                            anonymousClass182.A0r("audio_details");
                            CreatorViewerSignalAudioDetailsImpl Ess = creatorViewerSignalAudioDetails.Ess(new C37761pD(null));
                            anonymousClass182.A0d();
                            TrackOrOriginalSoundSchema trackOrOriginalSoundSchema = Ess.A01;
                            if (trackOrOriginalSoundSchema != null) {
                                anonymousClass182.A0r("audio_info");
                                anonymousClass182.A0d();
                                TrackMetadata trackMetadata = trackOrOriginalSoundSchema.A02;
                                if (trackMetadata != null) {
                                    anonymousClass182.A0r("metadata");
                                    AbstractC38068Gox.A00(anonymousClass182, trackMetadata.F3Q());
                                }
                                OriginalSoundData originalSoundData = trackOrOriginalSoundSchema.A00;
                                if (originalSoundData != null) {
                                    anonymousClass182.A0r("original_sound");
                                    C3XP.A00(anonymousClass182, originalSoundData);
                                }
                                TrackData trackData = trackOrOriginalSoundSchema.A01;
                                if (trackData != null) {
                                    anonymousClass182.A0r("track");
                                    AbstractC84383pX.A00(anonymousClass182, trackData.F3P());
                                }
                                anonymousClass182.A0a();
                            }
                            FormattedString formattedString4 = Ess.A00;
                            if (formattedString4 != null) {
                                A01(anonymousClass182, formattedString4, "subtitle");
                            }
                            anonymousClass182.A0a();
                        }
                        CreatorViewerSignalPlainDetails creatorViewerSignalPlainDetails = Esu.A01;
                        if (creatorViewerSignalPlainDetails != null) {
                            anonymousClass182.A0r("plain_details");
                            CreatorViewerSignalPlainDetailsImpl Esy = creatorViewerSignalPlainDetails.Esy();
                            anonymousClass182.A0d();
                            String str4 = Esy.A01;
                            if (str4 != null) {
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, str4);
                            }
                            FormattedString formattedString5 = Esy.A00;
                            if (formattedString5 != null) {
                                A01(anonymousClass182, formattedString5, "subtitle");
                            }
                            anonymousClass182.A0a();
                        }
                        CreatorViewerSignalReelsTextDetails creatorViewerSignalReelsTextDetails = Esu.A02;
                        if (creatorViewerSignalReelsTextDetails != null) {
                            anonymousClass182.A0r("reels_text_details");
                            CreatorViewerSignalReelsTextDetailsImpl Esz = creatorViewerSignalReelsTextDetails.Esz();
                            anonymousClass182.A0d();
                            FormattedString formattedString6 = Esz.A01;
                            if (formattedString6 != null) {
                                A01(anonymousClass182, formattedString6, "subtitle");
                            }
                            ClipsTextFormatType clipsTextFormatType = Esz.A00;
                            if (clipsTextFormatType != null) {
                                anonymousClass182.A0S("text_format_type", clipsTextFormatType.A00);
                            }
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0a();
                    }
                    InspirationSignalType inspirationSignalType = Esx.A01;
                    if (inspirationSignalType != null) {
                        anonymousClass182.A0S("signal_type", inspirationSignalType.A00);
                    }
                    AbstractC37301Gc2.A1F(anonymousClass182, Esx.A02);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        AbstractC37301Gc2.A1F(anonymousClass182, h30.A02);
        anonymousClass182.A0a();
    }

    public static void A01(AnonymousClass182 anonymousClass182, FormattedString formattedString, String str) {
        anonymousClass182.A0r(str);
        IO9.A00(anonymousClass182, formattedString.Eth());
    }
}
