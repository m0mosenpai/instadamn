package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHour;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.save.model.CollaborativeCollectionMetadata;
import com.instagram.save.model.SavedCollection;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.W6r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70139W6r {
    public static SavedCollection parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            SavedCollection savedCollection = new SavedCollection();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("collection_id".equals(A0s)) {
                    savedCollection.A0F = AbstractC167017dG.A0m(c16l);
                } else if ("collection_name".equals(A0s)) {
                    savedCollection.A0G = AbstractC167017dG.A0m(c16l);
                } else if ("collection_owner".equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    savedCollection.A08 = AbstractC38851rI.A00(c16l, false);
                } else if ("collection_media_count".equals(A0s)) {
                    savedCollection.A0E = AbstractC166997dE.A0h(c16l);
                } else if ("collection_locations_count".equals(A0s)) {
                    savedCollection.A0D = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(197).equals(A0s)) {
                    savedCollection.A04 = C38321qM.A0h.A0B(c16l, true);
                } else if ("cover_image_thumbnail_url".equals(A0s)) {
                    savedCollection.A01 = AbstractC222616c.A00(c16l);
                } else if ("privacy_mode".equals(A0s)) {
                    CollectionPrivacyModeEnum collectionPrivacyModeEnum = (CollectionPrivacyModeEnum) CollectionPrivacyModeEnum.A01.get(AbstractC167017dG.A0m(c16l));
                    if (collectionPrivacyModeEnum == null) {
                        collectionPrivacyModeEnum = CollectionPrivacyModeEnum.A07;
                    }
                    savedCollection.A00 = collectionPrivacyModeEnum;
                } else if ("collection_type".equals(A0s)) {
                    savedCollection.A07 = VWQ.A00(c16l.A1Q());
                } else if ("cover_media_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1N(c16l, arrayList);
                        }
                    }
                    savedCollection.A0L = arrayList;
                } else if ("cover_audio_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C68839Vcv parseFromJson = VWO.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    savedCollection.A0J = arrayList;
                } else if ("product_cover_image_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ProductImageContainerImpl parseFromJson2 = AbstractC111144zV.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    savedCollection.A0M = arrayList;
                } else if ("has_private_media".equals(A0s)) {
                    savedCollection.A0C = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1095).equals(A0s)) {
                    savedCollection.A06 = (EnumC33380EpD) EnumC33380EpD.A01.get(c16l.A1Q());
                } else if ("most_recent_saved_location".equals(A0s)) {
                    savedCollection.A03 = VT3.parseFromJson(c16l);
                } else if ("contains_provided_media_id".equals(A0s)) {
                    savedCollection.A09 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_cover_placeholder".equals(A0s)) {
                    savedCollection.A0A = AbstractC166997dE.A0d(c16l);
                } else if ("collab_meta".equals(A0s)) {
                    savedCollection.A05 = VWP.parseFromJson(c16l);
                } else if ("has_liked".equals(A0s)) {
                    savedCollection.A0B = AbstractC166997dE.A0d(c16l);
                } else {
                    C55702hA.A01(c16l, savedCollection, A0s);
                }
                c16l.A0z();
            }
            C38321qM c38321qM = savedCollection.A04;
            if (c38321qM != null) {
                savedCollection.A0H = c38321qM.getId();
            }
            Iterator it = savedCollection.A0L.iterator();
            while (it.hasNext()) {
                savedCollection.A0K.add(((C38321qM) it.next()).getId());
            }
            return savedCollection;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, SavedCollection savedCollection) {
        anonymousClass182.A0d();
        String str = savedCollection.A0F;
        if (str != null) {
            anonymousClass182.A0S("collection_id", str);
        }
        String str2 = savedCollection.A0G;
        if (str2 != null) {
            anonymousClass182.A0S("collection_name", str2);
        }
        if (savedCollection.A08 != null) {
            anonymousClass182.A0r("collection_owner");
            User user = savedCollection.A08;
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        Integer num = savedCollection.A0E;
        if (num != null) {
            anonymousClass182.A0Q("collection_media_count", num.intValue());
        }
        Integer num2 = savedCollection.A0D;
        if (num2 != null) {
            anonymousClass182.A0Q("collection_locations_count", num2.intValue());
        }
        if (savedCollection.A04 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(197));
            C38321qM c38321qM = savedCollection.A04;
            C38801rC c38801rC = C38321qM.A0h;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        if (savedCollection.A01 != null) {
            anonymousClass182.A0r("cover_image_thumbnail_url");
            AbstractC222616c.A01(anonymousClass182, savedCollection.A01);
        }
        CollectionPrivacyModeEnum collectionPrivacyModeEnum = savedCollection.A00;
        if (collectionPrivacyModeEnum != null) {
            anonymousClass182.A0S("privacy_mode", collectionPrivacyModeEnum.A00);
        }
        EnumC33416Epn enumC33416Epn = savedCollection.A07;
        if (enumC33416Epn != null) {
            anonymousClass182.A0S("collection_type", enumC33416Epn.A01);
        }
        if (savedCollection.A0L != null) {
            C16V.A03(anonymousClass182, "cover_media_list");
            for (C38321qM c38321qM2 : savedCollection.A0L) {
                if (c38321qM2 != null) {
                    C38801rC c38801rC2 = C38321qM.A0h;
                    C38801rC.A07(anonymousClass182, c38321qM2);
                }
            }
            anonymousClass182.A0Z();
        }
        if (savedCollection.A0J != null) {
            C16V.A03(anonymousClass182, "cover_audio_list");
            for (C68839Vcv c68839Vcv : savedCollection.A0J) {
                if (c68839Vcv != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0r("thumbnail_uri");
                    AbstractC222616c.A01(anonymousClass182, c68839Vcv.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (savedCollection.A0M != null) {
            C16V.A03(anonymousClass182, "product_cover_image_list");
            for (ProductImageContainerImpl productImageContainerImpl : savedCollection.A0M) {
                if (productImageContainerImpl != null) {
                    AbstractC111144zV.A00(anonymousClass182, productImageContainerImpl);
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool = savedCollection.A0C;
        if (bool != null) {
            anonymousClass182.A0T("has_private_media", bool.booleanValue());
        }
        EnumC33380EpD enumC33380EpD = savedCollection.A06;
        if (enumC33380EpD != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(1095), enumC33380EpD.A00);
        }
        if (savedCollection.A03 != null) {
            anonymousClass182.A0r("most_recent_saved_location");
            MediaMapPin mediaMapPin = savedCollection.A03;
            anonymousClass182.A0d();
            Double d = mediaMapPin.A0A;
            if (d != null) {
                anonymousClass182.A0O("lat", d.doubleValue());
            }
            Double d2 = mediaMapPin.A0B;
            if (d2 != null) {
                anonymousClass182.A0O("lng", d2.doubleValue());
            }
            if (mediaMapPin.A09 != null) {
                anonymousClass182.A0r("location");
                AbstractC84373pU.A00(anonymousClass182, mediaMapPin.A09);
            }
            String str3 = mediaMapPin.A0D;
            if (str3 != null) {
                anonymousClass182.A0S("media_id", str3);
            }
            if (mediaMapPin.A05 != null) {
                anonymousClass182.A0r("thumbnail_url");
                AbstractC222616c.A01(anonymousClass182, mediaMapPin.A05);
            }
            if (mediaMapPin.A06 != null) {
                anonymousClass182.A0r("page_info");
                LocationPageInformation locationPageInformation = mediaMapPin.A06;
                anonymousClass182.A0d();
                String str4 = locationPageInformation.A08;
                if (str4 != null) {
                    anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str4);
                }
                String str5 = locationPageInformation.A09;
                if (str5 != null) {
                    anonymousClass182.A0S("phone", str5);
                }
                String str6 = locationPageInformation.A0A;
                if (str6 != null) {
                    anonymousClass182.A0S("website", str6);
                }
                String str7 = locationPageInformation.A06;
                if (str7 != null) {
                    anonymousClass182.A0S("category", str7);
                }
                Integer num3 = locationPageInformation.A03;
                if (num3 != null) {
                    anonymousClass182.A0Q("price_range", num3.intValue());
                }
                String str8 = locationPageInformation.A05;
                if (str8 != null) {
                    anonymousClass182.A0S("location_address", str8);
                }
                String str9 = locationPageInformation.A07;
                if (str9 != null) {
                    anonymousClass182.A0S("location_city", str9);
                }
                Integer num4 = locationPageInformation.A04;
                if (num4 != null) {
                    anonymousClass182.A0Q("location_region", num4.intValue());
                }
                String str10 = locationPageInformation.A0B;
                if (str10 != null) {
                    anonymousClass182.A0S("location_zip", str10);
                }
                if (locationPageInformation.A01 != null) {
                    anonymousClass182.A0r("hours");
                    LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = locationPageInformation.A01;
                    anonymousClass182.A0d();
                    String str11 = locationPageInfoPageOperationHourResponse.A03;
                    if (str11 != null) {
                        anonymousClass182.A0S(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str11);
                    }
                    if (locationPageInfoPageOperationHourResponse.A04 != null) {
                        C16V.A03(anonymousClass182, "schedule");
                        for (LocationPageInfoPageOperationHour locationPageInfoPageOperationHour : locationPageInfoPageOperationHourResponse.A04) {
                            if (locationPageInfoPageOperationHour != null) {
                                anonymousClass182.A0d();
                                String str12 = locationPageInfoPageOperationHour.A00;
                                if (str12 != null) {
                                    anonymousClass182.A0S("day_of_week", str12);
                                }
                                if (locationPageInfoPageOperationHour.A01 != null) {
                                    C16V.A03(anonymousClass182, "hours");
                                    Iterator it = locationPageInfoPageOperationHour.A01.iterator();
                                    while (it.hasNext()) {
                                        AbstractC167017dG.A1F(anonymousClass182, it);
                                    }
                                    anonymousClass182.A0Z();
                                }
                                C55702hA.A00(anonymousClass182, locationPageInfoPageOperationHour);
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    String str13 = locationPageInfoPageOperationHourResponse.A01;
                    if (str13 != null) {
                        anonymousClass182.A0S("current_status", str13);
                    }
                    String str14 = locationPageInfoPageOperationHourResponse.A02;
                    if (str14 != null) {
                        anonymousClass182.A0S("hours_today", str14);
                    }
                    Boolean bool2 = locationPageInfoPageOperationHourResponse.A00;
                    if (bool2 != null) {
                        anonymousClass182.A0T("is_open", bool2.booleanValue());
                    }
                    anonymousClass182.A0a();
                }
                if (locationPageInformation.A00 != null) {
                    anonymousClass182.A0r("ig_business");
                    C68757Vba c68757Vba = locationPageInformation.A00;
                    anonymousClass182.A0d();
                    if (c68757Vba.A00 != null) {
                        anonymousClass182.A0r("profile");
                        User user2 = c68757Vba.A00;
                        Parcelable.Creator creator2 = User.CREATOR;
                        AbstractC38851rI.A08(anonymousClass182, user2);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0T("has_menu", locationPageInformation.A0C);
                Integer num5 = locationPageInformation.A02;
                if (num5 != null) {
                    anonymousClass182.A0Q("num_guides", num5.intValue());
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0R("media_taken_at_seconds", mediaMapPin.A01);
            anonymousClass182.A0Q("rank", mediaMapPin.A00);
            if (mediaMapPin.A0E != null) {
                C16V.A03(anonymousClass182, AbstractC111324zv.A00(72));
                Iterator it2 = mediaMapPin.A0E.iterator();
                while (it2.hasNext()) {
                    MediaMapPinPreview mediaMapPinPreview = (MediaMapPinPreview) it2.next();
                    if (mediaMapPinPreview != null) {
                        anonymousClass182.A0d();
                        String str15 = mediaMapPinPreview.A01;
                        if (str15 != null) {
                            anonymousClass182.A0S("media_id", str15);
                        }
                        if (mediaMapPinPreview.A00 != null) {
                            anonymousClass182.A0r("thumbnail_url");
                            AbstractC222616c.A01(anonymousClass182, mediaMapPinPreview.A00);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            String str16 = mediaMapPin.A0C;
            if (str16 != null) {
                anonymousClass182.A0S("formatted_media_count", str16);
            }
            if (mediaMapPin.A04 != null) {
                anonymousClass182.A0r("thumbnail_override");
                AbstractC222616c.A01(anonymousClass182, mediaMapPin.A04);
            }
            if (mediaMapPin.A08 != null) {
                anonymousClass182.A0r("story");
                AbstractC38741r6.A00(anonymousClass182, mediaMapPin.A08);
            }
            EnumC68146VDo enumC68146VDo = mediaMapPin.A07;
            if (enumC68146VDo != null) {
                anonymousClass182.A0S("pin_type", enumC68146VDo.A00);
            }
            if (mediaMapPin.A03 != null) {
                anonymousClass182.A0r("clip");
                AbstractC111024zE.A00(anonymousClass182, mediaMapPin.A03);
            }
            anonymousClass182.A0a();
        }
        Boolean bool3 = savedCollection.A09;
        if (bool3 != null) {
            anonymousClass182.A0T("contains_provided_media_id", bool3.booleanValue());
        }
        Boolean bool4 = savedCollection.A0A;
        if (bool4 != null) {
            anonymousClass182.A0T("enable_cover_placeholder", bool4.booleanValue());
        }
        if (savedCollection.A05 != null) {
            anonymousClass182.A0r("collab_meta");
            CollaborativeCollectionMetadata collaborativeCollectionMetadata = savedCollection.A05;
            anonymousClass182.A0d();
            if (collaborativeCollectionMetadata.A02 != null) {
                C16V.A03(anonymousClass182, "facepile_users");
                for (User user3 : collaborativeCollectionMetadata.A02) {
                    if (user3 != null) {
                        Parcelable.Creator creator3 = User.CREATOR;
                        AbstractC38851rI.A08(anonymousClass182, user3);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str17 = collaborativeCollectionMetadata.A01;
            if (str17 != null) {
                anonymousClass182.A0S("social_context_subtitle", str17);
            }
            String str18 = collaborativeCollectionMetadata.A00;
            if (str18 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(998), str18);
            }
            anonymousClass182.A0a();
        }
        Boolean bool5 = savedCollection.A0B;
        if (bool5 != null) {
            anonymousClass182.A0T("has_liked", bool5.booleanValue());
        }
        C55702hA.A00(anonymousClass182, savedCollection);
        anonymousClass182.A0a();
    }
}
