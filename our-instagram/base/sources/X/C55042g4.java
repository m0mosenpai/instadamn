package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.2g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C55042g4 {
    public static final C55042g4 A00 = new Object();

    public static final void A00(EnumC55032g3 enumC55032g3) {
        C55042g4 c55042g4 = A00;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("viewer()");
        sb.append("{");
        sb.append("eligible_promotions.trigger_context_v2(<trigger_context_v2>).ig_parameters(<ig_parameters>).trigger_name(<trigger_name>).surface_nux_id(<surface>).external_gating_permitted_qps(<external_gating_permitted_qps>).supports_client_filters(true).include_holdouts(true)");
        sb.append("{");
        sb.append("edges");
        sb.append("{");
        sb.append("client_ttl_seconds,log_eligibility_waterfall,is_holdout,priority,");
        sb.append("time_range");
        sb.append("{start,end},");
        sb.append("node{");
        sb.append("id,promotion_id,logging_data,is_server_force_pass,max_impressions,triggers,");
        sb.append("contextual_filters");
        sb.append("{");
        sb.append("clause_type,");
        sb.append("filters{");
        sb.append("filter_type,unknown_action,");
        sb.append("value{");
        sb.append("name,required,bool_value,int_value,string_value");
        sb.append("},");
        sb.append("extra_datas{name,required,bool_value,int_value,string_value}");
        sb.append("}");
        c55042g4.A01(sb);
        c55042g4.A01(sb);
        c55042g4.A01(sb);
        sb.append("}");
        sb.append("}");
        sb.append("}");
        sb.append("},");
        sb.append("is_uncancelable,");
        sb.append("template{");
        sb.append("name,parameters{");
        sb.append("name,required,bool_value,string_value,color_value");
        sb.append("}");
        sb.append("},");
        sb.append("creatives{");
        sb.append("title{text},");
        sb.append("content{text},");
        sb.append("footer{text},");
        sb.append("social_context{text},");
        sb.append("social_context_images,");
        sb.append("primary_action{");
        sb.append("title{text},");
        sb.append("url,limit,dismiss_promotion");
        sb.append("},");
        sb.append("secondary_action{");
        sb.append("title{text},");
        sb.append("url,limit,dismiss_promotion");
        sb.append("},");
        sb.append("dismiss_action{");
        sb.append("title{text},");
        sb.append("url,limit,dismiss_promotion");
        sb.append("},");
        sb.append("bullet_list{");
        sb.append("title,subtitle,icon{uri,width,height}");
        sb.append("}");
        sb.append("image.scale(<scale>){");
        sb.append("uri,width,height");
        sb.append("}");
        if (enumC55032g3 == EnumC55032g3.A03) {
            sb.append(",dark_mode_image.scale(<scale>){");
            sb.append("uri,width,height");
            sb.append("}");
        }
        sb.append("}");
        sb.append("}");
        sb.append("}");
        sb.append("}");
        sb.append("}");
        sb.append("}");
        String obj = sb.toString();
        C14360o3.A07(obj);
        C14360o3.A0A(StringFormatUtil.formatStrLocaleSafe("Query QuickPromotionSurfaceQuery: Viewer%s", obj));
    }

    private final void A01(StringBuilder sb) {
        sb.append(",clauses{");
        sb.append("clause_type,");
        sb.append("filters{");
        sb.append("filter_type,unknown_action,");
        sb.append("value{");
        sb.append("name,required,bool_value,int_value,string_value");
        sb.append("},");
        sb.append("extra_datas{name,required,bool_value,int_value,string_value}");
        sb.append("}");
    }
}
