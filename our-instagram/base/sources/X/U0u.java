package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class U0u {
    public static U0v parseFromJson(C16L c16l) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C14360o3.A0B(c16l, 0);
        try {
            U0v u0v = new U0v();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    u0v.A07 = AbstractC38851rI.A00(c16l, false);
                } else if ("place".equals(A0q)) {
                    u0v.A06 = AbstractC69968Vyj.parseFromJson(c16l);
                } else if ("hashtag".equals(A0q)) {
                    u0v.A03 = AbstractC109614wn.parseFromJson(c16l);
                } else if ("keyword".equals(A0q)) {
                    u0v.A04 = MZ7.parseFromJson(c16l);
                } else if ("category".equals(A0q)) {
                    u0v.A05 = OPT.parseFromJson(c16l);
                } else if ("licensed_music".equals(A0q)) {
                    u0v.A01 = AbstractC84383pX.parseFromJson(c16l);
                } else if ("track_metadata".equals(A0q)) {
                    u0v.A02 = AbstractC38068Gox.parseFromJson(c16l);
                } else if ("original_audio".equals(A0q)) {
                    u0v.A00 = C3XP.parseFromJson(c16l);
                } else {
                    AbstractC37930GmS.A01(c16l, u0v, A0q);
                }
                c16l.A0z();
            }
            User user = u0v.A07;
            String str8 = "";
            if (user != null) {
                ((AbstractC65924TwV) u0v).A01 = 0;
                C14360o3.A0C(user, "null cannot be cast to non-null type com.instagram.user.model.User");
                u0v.A09 = user;
                u0v.A08 = C05F.A0N;
                User user2 = u0v.A07;
                if (user2 == null) {
                    str7 = "";
                } else {
                    str7 = user2.getId();
                }
                u0v.A0A = str7;
                User user3 = u0v.A07;
                if (user3 != null) {
                    str8 = user3.getUsername();
                }
                u0v.A0B = str8;
                return u0v;
            }
            C69794Vvd c69794Vvd = u0v.A06;
            if (c69794Vvd != null) {
                ((AbstractC65924TwV) u0v).A01 = 2;
                C14360o3.A0C(c69794Vvd, "null cannot be cast to non-null type com.instagram.model.place.Place");
                u0v.A09 = c69794Vvd;
                C69794Vvd c69794Vvd2 = u0v.A06;
                if (c69794Vvd2 == null) {
                    str6 = "";
                } else {
                    str6 = c69794Vvd2.A00().A05();
                    C14360o3.A07(str6);
                }
                u0v.A0A = str6;
                C69794Vvd c69794Vvd3 = u0v.A06;
                if (c69794Vvd3 != null) {
                    str8 = c69794Vvd3.A01();
                }
                u0v.A0B = str8;
                num = C05F.A0u;
            } else {
                HashtagImpl hashtagImpl = u0v.A03;
                if (hashtagImpl != null) {
                    ((AbstractC65924TwV) u0v).A01 = 1;
                    C14360o3.A0C(hashtagImpl, "null cannot be cast to non-null type com.instagram.model.hashtag.Hashtag");
                    u0v.A09 = hashtagImpl;
                    String str9 = hashtagImpl.A0C;
                    if (str9 == null) {
                        str9 = "";
                    }
                    u0v.A0A = str9;
                    String str10 = hashtagImpl.A0D;
                    if (str10 != null) {
                        str8 = str10;
                    }
                    u0v.A0B = str8;
                    num = C05F.A0C;
                } else {
                    Keyword keyword = u0v.A04;
                    if (keyword != null) {
                        ((AbstractC65924TwV) u0v).A01 = 4;
                        C14360o3.A0C(keyword, "null cannot be cast to non-null type com.instagram.model.keyword.Keyword");
                        u0v.A09 = keyword;
                        Keyword keyword2 = u0v.A04;
                        if (keyword2 == null || (str4 = keyword2.A03) == null) {
                            str4 = "";
                        }
                        u0v.A0A = str4;
                        if (keyword2 != null && (str5 = keyword2.A04) != null) {
                            str8 = str5;
                        }
                        u0v.A0B = str8;
                        num = C05F.A15;
                    } else {
                        MapQuery mapQuery = u0v.A05;
                        if (mapQuery != null) {
                            ((AbstractC65924TwV) u0v).A01 = 6;
                            C14360o3.A0C(mapQuery, "null cannot be cast to non-null type com.instagram.model.mapquery.MapQuery");
                            u0v.A09 = mapQuery;
                            MapQuery mapQuery2 = u0v.A05;
                            if (mapQuery2 == null) {
                                str3 = "";
                            } else {
                                str3 = mapQuery2.A00;
                            }
                            u0v.A0A = str3;
                            if (mapQuery2 != null) {
                                str8 = mapQuery2.A01;
                            }
                            u0v.A0B = str8;
                            num = C05F.A06;
                        } else {
                            TrackDataImpl trackDataImpl = u0v.A01;
                            if (trackDataImpl != null && u0v.A02 != null) {
                                ((AbstractC65924TwV) u0v).A01 = 7;
                                C14360o3.A0C(trackDataImpl, "null cannot be cast to non-null type com.instagram.api.schemas.TrackData");
                                u0v.A09 = trackDataImpl;
                                TrackDataImpl trackDataImpl2 = u0v.A01;
                                if (trackDataImpl2 == null || (str2 = trackDataImpl2.A0E) == null) {
                                    str2 = "";
                                }
                                u0v.A0A = str2;
                                if (trackDataImpl2 != null) {
                                    str = trackDataImpl2.A0E;
                                }
                                u0v.A0B = str8;
                                num = C05F.A1I;
                            } else {
                                OriginalSoundData originalSoundData = u0v.A00;
                                if (originalSoundData != null) {
                                    ((AbstractC65924TwV) u0v).A01 = 7;
                                    u0v.A09 = originalSoundData;
                                    str = originalSoundData.A0I;
                                    String str11 = str;
                                    if (str == null) {
                                        str11 = "";
                                    }
                                    u0v.A0A = str11;
                                } else {
                                    throw new IllegalArgumentException("Type for BlendedSearchEntry is unknown");
                                }
                            }
                            if (str != null) {
                                str8 = str;
                            }
                            u0v.A0B = str8;
                            num = C05F.A1I;
                        }
                    }
                }
            }
            u0v.A08 = num;
            return u0v;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
