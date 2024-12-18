package X;

import com.facebook.tigon.tigonhuc.HucClient;

/* loaded from: classes6.dex */
public final class GRF implements Runnable {
    public Object A00;
    public final /* synthetic */ C25531Mh A01;

    public static Double A00(Object[] objArr, int i) {
        if (((Number) objArr[i]) != null) {
            return Double.valueOf(r0.floatValue());
        }
        return null;
    }

    public static Long A01(Object[] objArr, int i) {
        if (((Number) objArr[i]) != null) {
            return Long.valueOf(r0.intValue());
        }
        return null;
    }

    public static String A02(int i, Object[] objArr) {
        Object obj = objArr[i];
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public GRF(C25531Mh c25531Mh) {
        this.A01 = c25531Mh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l;
        Object[] objArr = (Object[]) this.A00;
        C25531Mh c25531Mh = this.A01;
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled() && objArr != null) {
            c25531Mh.A0Q("key_ram_total_kb", (Long) objArr[0]);
            Long l2 = null;
            if (((Number) objArr[1]) != null) {
                l = Long.valueOf(r0.intValue());
            } else {
                l = null;
            }
            c25531Mh.A0Q("key_cpu_num_cores", l);
            c25531Mh.A0Q("key_cpu_max_frequency_mhz", A01(objArr, 2));
            c25531Mh.A0R("key_display_size_pixels", A02(3, objArr));
            c25531Mh.A0P("key_display_max_refresh_rate_fps", A00(objArr, 4));
            c25531Mh.A0O("key_display_hdr_supported", (Boolean) objArr[5]);
            c25531Mh.A0O("key_display_wide_colour_gamut_supported", (Boolean) objArr[6]);
            c25531Mh.A0O("key_camera_back_facing_present", (Boolean) objArr[7]);
            c25531Mh.A0O("key_camera_front_facing_present", (Boolean) objArr[8]);
            c25531Mh.A0O("key_camera_autofocus_supported", (Boolean) objArr[9]);
            c25531Mh.A0O("key_camera_motion_tracking_supported", (Boolean) objArr[10]);
            c25531Mh.A0O("key_camera_flash_supported", (Boolean) objArr[11]);
            c25531Mh.A0O("key_camera_is_full_hardware_level", (Boolean) objArr[12]);
            c25531Mh.A0O("key_camera_concurrent_capture_supported", (Boolean) objArr[13]);
            c25531Mh.A0O("key_camera_manual_post_processing_supported", (Boolean) objArr[14]);
            c25531Mh.A0O("key_camera_manual_sensor_supported", (Boolean) objArr[15]);
            c25531Mh.A0O("key_camera_raw_image_capture_supported", (Boolean) objArr[16]);
            c25531Mh.A0O("key_audio_is_low_latency", (Boolean) objArr[17]);
            c25531Mh.A0O("key_audio_is_pro_level", (Boolean) objArr[18]);
            c25531Mh.A0O("key_audio_midi_api_supported", (Boolean) objArr[19]);
            c25531Mh.A0O("key_audio_microphone_present", (Boolean) objArr[20]);
            c25531Mh.A0R("key_opengles_deqp_test_date", A02(21, objArr));
            c25531Mh.A0O("key_opengles_android_extension_pack_supported", (Boolean) objArr[22]);
            c25531Mh.A0R("key_vulkan_deqp_test_date", A02(23, objArr));
            c25531Mh.A0O("key_vulkan_hardware_compute_supported", (Boolean) objArr[24]);
            c25531Mh.A0Q("key_vulkan_hardware_level", A01(objArr, 25));
            c25531Mh.A0R("key_vulkan_hardware_version", A02(26, objArr));
            c25531Mh.A0R("key_opengles_renderer", A02(27, objArr));
            c25531Mh.A0R("key_opengles_vendor", A02(28, objArr));
            c25531Mh.A0R("key_opengles_version", A02(29, objArr));
            c25531Mh.A0Q("key_opengles_max_texture_size_pixels", A01(objArr, 30));
            c25531Mh.A0Q("key_opengles_max_image_texture_units", A01(objArr, 31));
            c25531Mh.A0Q("key_opengles_max_vertex_texture_image_units", A01(objArr, 32));
            c25531Mh.A0Q("key_opengles_max_combined_texture_image_units", A01(objArr, 33));
            c25531Mh.A0Q("key_opengles_max_geometry_texture_image_units", A01(objArr, 34));
            c25531Mh.A0Q("key_opengles_max_cube_map_texture_size", A01(objArr, 35));
            c25531Mh.A0Q("key_opengles_max_renderbuffer_size", A01(objArr, 36));
            c25531Mh.A0Q("key_opengles_max_viewport_width", A01(objArr, 37));
            c25531Mh.A0Q("key_opengles_max_viewport_height", A01(objArr, 38));
            c25531Mh.A0O("key_video_avc_software_decoder_supported", (Boolean) objArr[39]);
            c25531Mh.A0Q("key_video_avc_software_decoder_max_instances", A01(objArr, 40));
            c25531Mh.A0O("key_video_avc_hardware_decoder_supported", (Boolean) objArr[41]);
            c25531Mh.A0Q("key_video_avc_hardware_decoder_max_instances", A01(objArr, 42));
            c25531Mh.A0O("key_video_avc_software_encoder_supported", (Boolean) objArr[43]);
            c25531Mh.A0Q("key_video_avc_software_encoder_max_instances", A01(objArr, 44));
            c25531Mh.A0O("key_video_avc_hardware_encoder_supported", (Boolean) objArr[45]);
            c25531Mh.A0Q("key_video_avc_hardware_encoder_max_instances", A01(objArr, 46));
            c25531Mh.A0O("key_video_hevc_software_decoder_supported", (Boolean) objArr[47]);
            c25531Mh.A0Q("key_video_hevc_software_decoder_max_instances", A01(objArr, 48));
            c25531Mh.A0O("key_video_hevc_hardware_decoder_supported", (Boolean) objArr[49]);
            c25531Mh.A0Q("key_video_hevc_hardware_decoder_max_instances", A01(objArr, 50));
            c25531Mh.A0O("key_video_hevc_software_encoder_supported", (Boolean) objArr[51]);
            c25531Mh.A0Q("key_video_hevc_software_encoder_max_instances", A01(objArr, 52));
            c25531Mh.A0O("key_video_hevc_hardware_encoder_supported", (Boolean) objArr[53]);
            c25531Mh.A0Q("key_video_hevc_hardware_encoder_max_instances", A01(objArr, 54));
            c25531Mh.A0O("key_video_av1_software_decoder_supported", (Boolean) objArr[55]);
            c25531Mh.A0Q("key_video_av1_software_decoder_max_instances", A01(objArr, 56));
            c25531Mh.A0O("key_video_av1_hardware_decoder_supported", (Boolean) objArr[57]);
            c25531Mh.A0Q("key_video_av1_hardware_decoder_max_instances", A01(objArr, 58));
            c25531Mh.A0O("key_video_av1_software_encoder_supported", (Boolean) objArr[59]);
            c25531Mh.A0Q("key_video_av1_software_encoder_max_instances", A01(objArr, 60));
            c25531Mh.A0O("key_video_av1_hardware_encoder_supported", (Boolean) objArr[61]);
            c25531Mh.A0Q("key_video_av1_hardware_encoder_max_instances", A01(objArr, 62));
            c25531Mh.A0O("key_video_vp9_software_decoder_supported", (Boolean) objArr[63]);
            c25531Mh.A0Q("key_video_vp9_software_decoder_max_instances", A01(objArr, 64));
            c25531Mh.A0O("key_video_vp9_hardware_decoder_supported", (Boolean) objArr[65]);
            c25531Mh.A0Q("key_video_vp9_hardware_decoder_max_instances", A01(objArr, 66));
            c25531Mh.A0O("key_video_vp9_software_encoder_supported", (Boolean) objArr[67]);
            c25531Mh.A0Q("key_video_vp9_software_encoder_max_instances", A01(objArr, 68));
            c25531Mh.A0O("key_video_vp9_hardware_encoder_supported", (Boolean) objArr[69]);
            c25531Mh.A0Q("key_video_vp9_hardware_encoder_max_instances", A01(objArr, 70));
            c25531Mh.A0O("key_video_decoder_hdr_supported", (Boolean) objArr[71]);
            c25531Mh.A0O("key_video_encoder_hdr_supported", (Boolean) objArr[72]);
            c25531Mh.A0R("key_camera_back_sensor_pixel_resolution", A02(73, objArr));
            c25531Mh.A0R("key_camera_front_sensor_pixel_resolution", A02(74, objArr));
            c25531Mh.A0R("key_camera_back_sensor_physical_size_mm", A02(75, objArr));
            c25531Mh.A0R("key_camera_front_sensor_physical_size_mm", A02(76, objArr));
            c25531Mh.A0R("key_camera_front_jpeg_photo_max_pixel_resolution", A02(77, objArr));
            c25531Mh.A0R("key_camera_back_jpeg_photo_max_pixel_resolution", A02(78, objArr));
            c25531Mh.A0R("key_camera_front_raw_photo_max_pixel_resolution", A02(79, objArr));
            c25531Mh.A0R("key_camera_back_raw_photo_max_pixel_resolution", A02(80, objArr));
            c25531Mh.A0R("key_camera_front_raw10_photo_max_pixel_resolution", A02(81, objArr));
            c25531Mh.A0R("key_camera_back_raw10_photo_max_pixel_resolution", A02(82, objArr));
            c25531Mh.A0R("key_camera_front_raw12_photo_max_pixel_resolution", A02(83, objArr));
            c25531Mh.A0R("key_camera_back_raw12_photo_max_pixel_resolution", A02(84, objArr));
            c25531Mh.A0R("key_camera_front_heic_photo_max_pixel_resolution", A02(85, objArr));
            c25531Mh.A0R("key_camera_back_heic_photo_max_pixel_resolution", A02(86, objArr));
            c25531Mh.A0R("key_camera_front_ultra_hdr_photo_max_pixel_resolution", A02(87, objArr));
            c25531Mh.A0R("key_camera_back_ultra_hdr_photo_max_pixel_resolution", A02(88, objArr));
            c25531Mh.A0R("key_camera_front_preview_stream_max_pixel_resolution", A02(89, objArr));
            c25531Mh.A0R("key_camera_back_preview_stream_max_pixel_resolution", A02(90, objArr));
            c25531Mh.A0R("key_camera_front_video_stream_max_pixel_resolution", A02(91, objArr));
            c25531Mh.A0R("key_camera_back_video_stream_max_pixel_resolution", A02(92, objArr));
            c25531Mh.A0R("key_camera_front_cpu_stream_max_pixel_resolution", A02(93, objArr));
            c25531Mh.A0R("key_camera_back_cpu_stream_max_pixel_resolution", A02(94, objArr));
            c25531Mh.A0O("key_camera_front_hlg_hdr_video_supported", (Boolean) objArr[95]);
            c25531Mh.A0O("key_camera_back_hlg_hdr_video_supported", (Boolean) objArr[96]);
            c25531Mh.A0O("key_camera_front_burst_capture_supported", (Boolean) objArr[97]);
            c25531Mh.A0O("key_camera_back_burst_capture_supported", (Boolean) objArr[98]);
            c25531Mh.A0O("key_camera_front_ultra_high_resolution_sensor_supported", (Boolean) objArr[99]);
            c25531Mh.A0O("key_camera_back_ultra_high_resolution_sensor_supported", (Boolean) objArr[100]);
            c25531Mh.A0O("key_camera_front_logical_multi_camera_supported", (Boolean) objArr[101]);
            c25531Mh.A0O("key_camera_back_logical_multi_camera_supported", (Boolean) objArr[102]);
            c25531Mh.A0O("key_camera_front_zsl_private_reprocessing_supported", (Boolean) objArr[103]);
            c25531Mh.A0O("key_camera_back_zsl_private_reprocessing_supported", (Boolean) objArr[104]);
            c25531Mh.A0O("key_camera_front_zsl_yuv_reprocessing_supported", (Boolean) objArr[105]);
            c25531Mh.A0O("key_camera_back_zsl_yuv_reprocessing_supported", (Boolean) objArr[106]);
            c25531Mh.A0O("key_camera_front_remosaic_reprocessing_supported", (Boolean) objArr[107]);
            c25531Mh.A0O("key_camera_back_remosaic_reprocessing_supported", (Boolean) objArr[108]);
            c25531Mh.A0O("key_camera_front_depth_output_supported", (Boolean) objArr[109]);
            c25531Mh.A0O("key_camera_back_depth_output_supported", (Boolean) objArr[110]);
            c25531Mh.A0O("key_camera_front_read_sensor_settings_supported", (Boolean) objArr[111]);
            c25531Mh.A0O("key_camera_back_read_sensor_settings_supported", (Boolean) objArr[112]);
            c25531Mh.A0O("key_camera_front_secure_image_data_supported", (Boolean) objArr[113]);
            c25531Mh.A0O("key_camera_back_secure_image_data_supported", (Boolean) objArr[114]);
            c25531Mh.A0O("key_camera_front_stream_use_case_supported", (Boolean) objArr[115]);
            c25531Mh.A0O("key_camera_back_stream_use_case_supported", (Boolean) objArr[116]);
            c25531Mh.A0O("key_camera_front_constrained_high_speed_video_supported", (Boolean) objArr[117]);
            c25531Mh.A0O("key_camera_back_constrained_high_speed_video_supported", (Boolean) objArr[118]);
            c25531Mh.A0R("key_camera_front_constrained_high_speed_video_max_pixel_resolution", A02(119, objArr));
            c25531Mh.A0R("key_camera_back_constrained_high_speed_video_max_pixel_resolution", A02(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS, objArr));
            c25531Mh.A0P("key_camera_front_constrained_high_speed_video_max_fps", A00(objArr, 121));
            c25531Mh.A0P("key_camera_back_constrained_high_speed_video_max_fps", A00(objArr, 122));
            c25531Mh.A0Q("key_camera_front_constrained_high_speed_video_max_throughput_pps", (Long) objArr[123]);
            c25531Mh.A0Q("key_camera_back_constrained_high_speed_video_max_throughput_pps", (Long) objArr[124]);
            c25531Mh.A0P("key_camera_front_max_fps", A00(objArr, 125));
            c25531Mh.A0P("key_camera_back_max_fps", A00(objArr, 126));
            c25531Mh.A0Q("key_camera_front_max_throughput_pps", (Long) objArr[127]);
            c25531Mh.A0Q("key_camera_back_max_throughput_pps", (Long) objArr[128]);
            c25531Mh.A0O("key_camera_front_preview_stabilization_supported", (Boolean) objArr[129]);
            c25531Mh.A0O("key_camera_back_preview_stabilization_supported", (Boolean) objArr[130]);
            c25531Mh.A0O("key_camera_front_optical_stabilization_supported", (Boolean) objArr[131]);
            c25531Mh.A0O("key_camera_back_optical_stabilization_supported", (Boolean) objArr[132]);
            c25531Mh.A0O("key_camera_front_realtime_timestamp_supported", (Boolean) objArr[133]);
            c25531Mh.A0O("key_camera_back_realtime_timestamp_supported", (Boolean) objArr[134]);
            c25531Mh.A0O("key_camera_front_high_quality_noise_reduction_supported", (Boolean) objArr[135]);
            c25531Mh.A0O("key_camera_back_high_quality_noise_reduction_supported", (Boolean) objArr[136]);
            c25531Mh.A0O("key_camera_front_zsl_noise_reduction_supported", (Boolean) objArr[137]);
            c25531Mh.A0O("key_camera_back_zsl_noise_reduction_supported", (Boolean) objArr[138]);
            c25531Mh.A0O("key_camera_front_minimal_noise_reduction_supported", (Boolean) objArr[139]);
            c25531Mh.A0O("key_camera_back_minimal_noise_reduction_supported", (Boolean) objArr[140]);
            c25531Mh.A0O("key_camera_front_fast_noise_reduction_supported", (Boolean) objArr[141]);
            c25531Mh.A0O("key_camera_back_fast_noise_reduction_supported", (Boolean) objArr[142]);
            c25531Mh.A0O("key_camera_front_high_quality_tonemap_mode_supported", (Boolean) objArr[143]);
            c25531Mh.A0O("key_camera_back_high_quality_tonemap_mode_supported", (Boolean) objArr[144]);
            c25531Mh.A0O("key_camera_front_fast_tonemap_mode_supported", (Boolean) objArr[145]);
            c25531Mh.A0O("key_camera_back_fast_tonemap_mode_supported", (Boolean) objArr[146]);
            c25531Mh.A0O("key_camera_front_contrast_curve_tonemap_mode_supported", (Boolean) objArr[147]);
            c25531Mh.A0O("key_camera_back_contrast_curve_tonemap_mode_supported", (Boolean) objArr[148]);
            c25531Mh.A0O("key_camera_front_gamma_value_tonemap_mode_supported", (Boolean) objArr[149]);
            c25531Mh.A0O("key_camera_back_gamma_value_tonemap_mode_supported", (Boolean) objArr[150]);
            c25531Mh.A0O("key_camera_front_preset_curve_tonemap_mode_supported", (Boolean) objArr[151]);
            c25531Mh.A0O("key_camera_back_preset_curve_tonemap_mode_supported", (Boolean) objArr[152]);
            c25531Mh.A0O("key_camera_front_face_detection_mode_simple_supported", (Boolean) objArr[153]);
            c25531Mh.A0O("key_camera_back_face_detection_mode_simple_supported", (Boolean) objArr[154]);
            c25531Mh.A0O("key_camera_front_face_detection_mode_full_supported", (Boolean) objArr[155]);
            c25531Mh.A0O("key_camera_back_face_detection_mode_full_supported", (Boolean) objArr[156]);
            c25531Mh.A0Q("key_camera_front_face_detection_max_face_count", A01(objArr, 157));
            c25531Mh.A0Q("key_camera_back_face_detection_max_face_count", A01(objArr, 158));
            c25531Mh.A0O("key_camera_front_zoom_supported", (Boolean) objArr[159]);
            c25531Mh.A0O("key_camera_back_zoom_supported", (Boolean) objArr[160]);
            c25531Mh.A0O("key_camera_front_smooth_zoom_support", (Boolean) objArr[161]);
            c25531Mh.A0O("key_camera_back_smooth_zoom_support", (Boolean) objArr[162]);
            c25531Mh.A0P("key_camera_front_zoom_min_ratio", A00(objArr, 163));
            c25531Mh.A0P("key_camera_back_zoom_min_ratio", A00(objArr, 164));
            c25531Mh.A0P("key_camera_front_zoom_max_ratio", A00(objArr, 165));
            c25531Mh.A0P("key_camera_back_zoom_max_ratio", A00(objArr, 166));
            c25531Mh.A0O("key_camera_front_iso_sensitivity_control_supported", (Boolean) objArr[167]);
            c25531Mh.A0O("key_camera_back_iso_sensitivity_control_supported", (Boolean) objArr[168]);
            c25531Mh.A0Q("key_camera_front_min_iso_sensitivity", A01(objArr, 169));
            c25531Mh.A0Q("key_camera_back_min_iso_sensitivity", A01(objArr, AbstractC62862SUj.MAX_FACTORIAL));
            c25531Mh.A0Q("key_camera_front_max_iso_sensitivity", A01(objArr, 171));
            c25531Mh.A0Q("key_camera_back_max_iso_sensitivity", A01(objArr, 172));
            c25531Mh.A0O("key_camera_front_exposure_control_supported", (Boolean) objArr[173]);
            c25531Mh.A0O("key_camera_back_exposure_control_supported", (Boolean) objArr[174]);
            c25531Mh.A0Q("key_camera_front_min_exposure_time_nanoseconds", (Long) objArr[175]);
            c25531Mh.A0Q("key_camera_back_min_exposure_time_nanoseconds", (Long) objArr[176]);
            c25531Mh.A0Q("key_camera_front_max_exposure_time_nanoseconds", (Long) objArr[177]);
            c25531Mh.A0Q("key_camera_back_max_exposure_time_nanoseconds", (Long) objArr[178]);
            c25531Mh.A0O("key_camera_front_focus_mode_off_supported", (Boolean) objArr[179]);
            c25531Mh.A0O("key_camera_back_focus_mode_off_supported", (Boolean) objArr[180]);
            c25531Mh.A0O("key_camera_front_focus_mode_auto_supported", (Boolean) objArr[181]);
            c25531Mh.A0O("key_camera_back_focus_mode_auto_supported", (Boolean) objArr[182]);
            c25531Mh.A0O("key_camera_front_focus_mode_macro_supported", (Boolean) objArr[183]);
            c25531Mh.A0O("key_camera_back_focus_mode_macro_supported", (Boolean) objArr[184]);
            c25531Mh.A0O("key_camera_front_focus_mode_edof_supported", (Boolean) objArr[185]);
            c25531Mh.A0O("key_camera_back_focus_mode_edof_supported", (Boolean) objArr[186]);
            c25531Mh.A0O("key_camera_front_focus_mode_continuous_picture_supported", (Boolean) objArr[187]);
            c25531Mh.A0O("key_camera_back_focus_mode_continuous_picture_supported", (Boolean) objArr[188]);
            c25531Mh.A0O("key_camera_front_focus_mode_continuous_video_supported", (Boolean) objArr[189]);
            c25531Mh.A0O("key_camera_back_focus_mode_continuous_video_supported", (Boolean) objArr[190]);
            c25531Mh.A0O("key_camera_front_auto_exposure_lock_supported", (Boolean) objArr[191]);
            c25531Mh.A0O("key_camera_back_auto_exposure_lock_supported", (Boolean) objArr[192]);
            c25531Mh.A0O("key_camera_front_auto_white_balance_lock_supported", (Boolean) objArr[193]);
            c25531Mh.A0O("key_camera_back_auto_white_balance_lock_supported", (Boolean) objArr[194]);
            c25531Mh.A0O("key_camera_front_variable_aperture_supported", (Boolean) objArr[195]);
            c25531Mh.A0O("key_camera_back_variable_aperture_supported", (Boolean) objArr[196]);
            c25531Mh.A0P("key_camera_front_min_aperture_f", A00(objArr, 197));
            c25531Mh.A0P("key_camera_back_min_aperture_f", A00(objArr, 198));
            c25531Mh.A0P("key_camera_front_max_aperture_f", A00(objArr, 199));
            c25531Mh.A0P("key_camera_back_max_aperture_f", A00(objArr, 200));
            c25531Mh.A0Q("key_camera_front_max_num_focus_areas", A01(objArr, 201));
            c25531Mh.A0Q("key_camera_back_max_num_focus_areas", A01(objArr, 202));
            c25531Mh.A0Q("key_camera_front_max_num_exposure_metering_areas", A01(objArr, 203));
            c25531Mh.A0Q("key_camera_back_max_num_exposure_metering_areas", A01(objArr, 204));
            c25531Mh.A0Q("key_camera_front_max_num_white_balance_metering_areas", A01(objArr, 205));
            if (((Number) objArr[206]) != null) {
                l2 = Long.valueOf(r0.intValue());
            }
            c25531Mh.A0Q("key_camera_back_max_num_white_balance_metering_areas", l2);
            c25531Mh.A0O("key_camera_front_video_snapshot_supported", (Boolean) objArr[207]);
            c25531Mh.A0O("key_camera_back_video_snapshot_supported", (Boolean) objArr[208]);
            c25531Mh.Cht();
            InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
            ARD.E77("preference_has_logged_static_attributes", true);
            ARD.apply();
        }
    }

    public GRF() {
    }
}
