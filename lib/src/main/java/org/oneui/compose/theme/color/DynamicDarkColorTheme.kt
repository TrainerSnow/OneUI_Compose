package org.oneui.compose.theme.color

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import org.oneui.compose.R
import org.oneui.compose.util.color

/**
 * A [OneUIColorTheme] that receives its colors from the colors.xml file. When dynamic theming is enabled,
 *      those colors that have a dynamic color provided for will be dynamically adjusted.
 */
internal val DynamicDarkColorTheme: OneUIColorTheme
    @Composable get() = object : OneUIColorTheme {
        override val seslActionBarBackgroundColor: Color =
            color(R.color.sesl_action_bar_background_color_dark)
        override val seslActionBarTextColorMenu: Color =
            color(R.color.sesl_action_bar_text_color_menu_dark)
        override val seslActionBarTextColorSubtitle: Color =
            color(R.color.sesl_action_bar_text_color_subtitle_dark)
        override val seslActionBarTextColorTitle: Color =
            color(R.color.sesl_action_bar_text_color_title_dark)
        override val seslActionBarToastTextColor: Color =
            color(R.color.sesl_action_bar_toast_text_color_dark)
        override val seslBackgroundColor: Color = color(R.color.sesl_background_color_dark)
        override val seslBackgroundFloating: Color = color(R.color.sesl_background_floating_dark)
        override val seslBtnBackgroundColor: Color = color(R.color.sesl_btn_background_color_dark)
        override val seslBtnDefaultTextColor: Color =
            color(R.color.sesl_btn_default_text_color_dark)
        override val seslControlNormalColor: Color = color(R.color.sesl_control_normal_color_dark)
        override val seslDescriptionTextColor: Color =
            color(R.color.sesl_description_text_color_dark)
        override val seslDialogBodyTextColor: Color =
            color(R.color.sesl_dialog_body_text_color_dark)
        override val seslDialogButtonRedText: Color =
            color(R.color.sesl_dialog_button_red_text_dark)
        override val seslDialogButtonTextColor: Color =
            color(R.color.sesl_dialog_button_text_color_dark)
        override val seslDialogListTextColor: Color =
            color(R.color.sesl_dialog_list_text_color_dark)
        override val seslDialogScrollbarHandleTintColorMtrl: Color =
            color(R.color.sesl_dialog_scrollbar_handle_tint_color_mtrl_dark)
        override val seslDialogTitleTextColor: Color =
            color(R.color.sesl_dialog_title_text_color_dark)
        override val seslDropdownScrollbarHandleColor: Color =
            color(R.color.sesl_dropdown_scrollbar_handle_color_dark)
        override val seslEdgeEffectDeviceDefault: Color =
            color(R.color.sesl_edge_effect_device_default_dark)
        override val seslEditTextColor: Color = color(R.color.sesl_edit_text_color_dark)
        override val seslEditTextColorDisabled: Color =
            color(R.color.sesl_edit_text_color_disabled_dark)
        override val seslEditTextHintColor: Color = color(R.color.sesl_edit_text_hint_color_dark)
        override val seslEditTextTintColor: Color = color(R.color.sesl_edit_text_tint_color_dark)
        override val seslEditTextTintColorDisabled: Color =
            color(R.color.sesl_edit_text_tint_color_disabled_dark)
        override val seslEditTextTintColorUnfocused: Color =
            color(R.color.sesl_edit_text_tint_color_unfocused_dark)
        override val seslFunctionalGreen: Color = color(R.color.sesl_functional_green_dark)
        override val seslFunctionalOrange: Color = color(R.color.sesl_functional_orange_dark)
        override val seslFunctionalRed: Color = color(R.color.sesl_functional_red_dark)
        override val seslHighlightedTextColor: Color =
            color(R.color.sesl_highlighted_text_color_dark)
        override val seslListDividerColor: Color = color(R.color.sesl_list_divider_color_dark)
        override val seslListGoToTopArrowBottom: Color =
            color(R.color.sesl_list_go_to_top_arrow_bottom_dark)
        override val seslListGoToTopArrowTop: Color =
            color(R.color.sesl_list_go_to_top_arrow_top_dark)
        override val seslListGoToTopInnerRound: Color =
            color(R.color.sesl_list_go_to_top_inner_round_dark)
        override val seslListGoToTopOuterRound: Color =
            color(R.color.sesl_list_go_to_top_outer_round_dark)
        override val seslListGoToTopRipple: Color = color(R.color.sesl_list_go_to_top_ripple_dark)
        override val seslListRippleColor: Color = color(R.color.sesl_list_ripple_color_dark)
        override val seslPopupMenuDividerColor: Color =
            color(R.color.sesl_popup_menu_divider_color_dark)
        override val seslPopupMenuItemTextColorChecked: Color =
            color(R.color.sesl_popup_menu_item_text_color_checked_dark)
        override val seslPopupMenuItemTextColorDisabled: Color =
            color(R.color.sesl_popup_menu_item_text_color_disabled_dark)
        override val seslPrimaryColor: Color = color(R.color.sesl_primary_color_dark)
        override val seslPrimaryDarkColor: Color = color(R.color.sesl_primary_dark_color_dark)
        override val seslPrimaryTextColor: Color = color(R.color.sesl_primary_text_color_dark)
        override val seslSecondaryTextColor: Color = color(R.color.sesl_secondary_text_color_dark)
        override val seslProgressControlColorActivated: Color =
            color(R.color.sesl_progress_control_color_activated_dark)
        override val seslProgressControlColorNormal: Color =
            color(R.color.sesl_progress_control_color_normal_dark)
        override val seslProgressDialogBackgroundColor: Color =
            color(R.color.sesl_progress_dialog_background_color_dark)
        override val seslProgressDialogCircleTextColor: Color =
            color(R.color.sesl_progress_dialog_circle_text_color_dark)
        override val seslRippleColor: Color = color(R.color.sesl_ripple_color_dark)
        override val seslRoundAndBgcolor: Color = color(R.color.sesl_round_and_bgcolor_dark)
        override val seslScrollbarHandleTintColor: Color =
            color(R.color.sesl_scrollbar_handle_tint_color_dark)
        override val seslSearchViewBackgroundHintTextColor: Color =
            color(R.color.sesl_search_view_background_hint_text_color_dark)
        override val seslSearchViewBackgroundIconColor: Color =
            color(R.color.sesl_search_view_background_icon_color_dark)
        override val seslSearchViewBackgroundTextColor: Color =
            color(R.color.sesl_search_view_background_text_color_dark)
        override val seslSeekbarDisableColorActivated: Color =
            color(R.color.sesl_seekbar_disable_color_activated_dark)
        override val seslSeekbarOverlapColorActivated: Color =
            color(R.color.sesl_seekbar_overlap_color_activated_dark)
        override val seslSeekbarOverlapColorDefault: Color =
            color(R.color.sesl_seekbar_overlap_color_default_dark)
        override val seslSpinnerDropdownItemTextColorDisabled: Color =
            color(R.color.sesl_spinner_dropdown_item_text_color_disabled_dark)
        override val seslSpinnerDropdownItemTextColorNormal: Color =
            color(R.color.sesl_spinner_dropdown_item_text_color_normal_dark)
        override val seslSpinnerIconColorDefault: Color =
            color(R.color.sesl_spinner_icon_color_default_dark)
        override val seslSpinnerIconColorDisabled: Color =
            color(R.color.sesl_spinner_icon_color_disabled_dark)
        override val seslSpinnerItemTextColorDisabled: Color =
            color(R.color.sesl_spinner_item_text_color_disabled_dark)
        override val seslSpinnerItemTextColorNormal: Color =
            color(R.color.sesl_spinner_item_text_color_normal_dark)
        override val seslStatusBarColor: Color = color(R.color.sesl_status_bar_color_dark)
        override val seslSwitchDividerColor: Color = color(R.color.sesl_switch_divider_color_dark)
        override val seslSwitchbarOffBackgroundColor: Color =
            color(R.color.sesl_switchbar_off_background_color_dark)
        override val seslSwitchbarOffTextColor: Color =
            color(R.color.sesl_switchbar_off_text_color_dark)
        override val seslSwitchbarOnBackgroundColor: Color =
            color(R.color.sesl_switchbar_on_background_color_dark)
        override val seslTooltipBackground: Color = color(R.color.sesl_tooltip_background_dark)
        override val seslTooltipForeground: Color = color(R.color.sesl_tooltip_foreground_dark)
        override val seslFragmentBgcolor: Color = color(R.color.sesl_fragment_bgcolor_dark)
        override val seslFragmentFgcolor: Color = color(R.color.sesl_fragment_fgcolor_dark)
        override val seslIndexBarBackgroundTintColor: Color =
            color(R.color.sesl_index_bar_background_tint_color_dark)
        override val seslIndexBarTextColor: Color = color(R.color.sesl_index_bar_text_color_dark)
        override val seslDatePickerButtonTintColor: Color =
            color(R.color.sesl_date_picker_button_tint_color_dark)
        override val seslDatePickerHeaderTextColor: Color =
            color(R.color.sesl_date_picker_header_text_color_dark)
        override val seslDatePickerNormalDayNumberTextColor: Color =
            color(R.color.sesl_date_picker_normal_day_number_text_color_dark)
        override val seslDatePickerNormalTextColor: Color =
            color(R.color.sesl_date_picker_normal_text_color_dark)
        override val seslDatePickerSaturdayTextColor: Color =
            color(R.color.sesl_date_picker_saturday_text_color_dark)
        override val seslDatePickerSaturdayWeekTextColor: Color =
            color(R.color.sesl_date_picker_saturday_week_text_color_dark)
        override val seslDatePickerSelectedDayNumberTextColor: Color =
            color(R.color.sesl_date_picker_selected_day_number_text_color_dark)
        override val seslDatePickerSundayNumberTextColor: Color =
            color(R.color.sesl_date_picker_sunday_number_text_color_dark)
        override val seslDatePickerSundayTextColor: Color =
            color(R.color.sesl_date_picker_sunday_text_color_dark)
        override val seslColorPickerSelectedColorItemTextColor: Color =
            color(R.color.sesl_color_picker_selected_color_item_text_color_dark)
        override val seslColorPickerStrokeColor: Color =
            color(R.color.sesl_color_picker_stroke_color_dark)
        override val seslColorPickerTabSelectedBackground: Color =
            color(R.color.sesl_color_picker_tab_selected_background_dark)
        override val seslColorPickerTabSelected: Color =
            color(R.color.sesl_color_picker_tab_selected_dark)
        override val seslColorPickerUsedColorItemEmptySlotColor: Color =
            color(R.color.sesl_color_picker_used_color_item_empty_slot_color_dark)
        override val seslColorPickerUsedColorTextColor: Color =
            color(R.color.sesl_color_picker_used_color_text_color_dark)
        override val seslSwipeRefreshBackground: Color =
            color(R.color.sesl_swipe_refresh_background_dark)
        override val foregroundMaterial: Color = color(R.color.foreground_material_dark)
        override val backgroundMaterial: Color = color(R.color.background_material_dark)
        override val backgroundFloatingMaterial: Color =
            color(R.color.background_floating_material_dark)
        override val primaryMaterial: Color = color(R.color.primary_material_dark)
        override val primaryDarkMaterial: Color = color(R.color.primary_dark_material_dark)
        override val accentMaterial: Color = color(R.color.accent_material_dark)
        override val switchThumbNormalMaterial: Color =
            color(R.color.switch_thumb_normal_material_dark)
        override val primaryTextDefaultMaterial: Color =
            color(R.color.primary_text_default_material_dark)
        override val secondaryTextDefaultMaterial: Color =
            color(R.color.secondary_text_default_material_dark)
        override val seslDialogDividerColorMaterial: Color =
            color(R.color.sesl_dialog_divider_color_material_dark)
        override val seslDialogSubTextColorMaterial: Color =
            color(R.color.sesl_dialog_sub_text_color_material_dark)
        override val seslDialogWindowBackgroundColorMaterial: Color =
            color(R.color.sesl_dialog_window_background_color_material_dark)
        override val abcDecorViewStatusGuard: Color =
            color(R.color.abc_decor_view_status_guard_dark)
        override val seslActionBarRippleColor: Color =
            color(R.color.sesl_action_bar_ripple_color_dark)
        override val seslBlack: Color = color(R.color.sesl_black_dark)
        override val seslWhite: Color = color(R.color.sesl_white_dark)
        override val seslContextMenuTitleTextColor: Color =
            color(R.color.sesl_context_menu_title_text_color_dark)
        override val seslControlActivatedColor: Color =
            color(R.color.sesl_control_activated_color_dark)
        override val seslDialogShowButtonBackgroundColor: Color =
            color(R.color.sesl_dialog_show_button_background_color_dark)
        override val seslDialogTextBodyColor: Color =
            color(R.color.sesl_dialog_text_body_color_dark)
        override val seslErrorColor: Color = color(R.color.sesl_error_color_dark)
        override val seslFastScrollbarBgColor: Color =
            color(R.color.sesl_fast_scrollbar_bg_color_dark)
        override val seslInputMethodNavigationGuard: Color =
            color(R.color.sesl_input_method_navigation_guard_dark)
        override val seslListSubheaderTextColor: Color =
            color(R.color.sesl_list_subheader_text_color_dark)
        override val seslLoadingProgressColor1: Color =
            color(R.color.sesl_loading_progress_color1_dark)
        override val seslLoadingProgressColor2: Color =
            color(R.color.sesl_loading_progress_color2_dark)
        override val seslMenuBadgeBackgroundColor: Color =
            color(R.color.sesl_menu_badge_background_color_dark)
        override val seslMenuBadgeTextColor: Color = color(R.color.sesl_menu_badge_text_color_dark)
        override val seslMenuPopupBackgroundColor: Color =
            color(R.color.sesl_menu_popup_background_color_dark)
        override val seslMenuPopupBackgroundStrokeColor: Color =
            color(R.color.sesl_menu_popup_background_stroke_color_dark)
        override val seslPopupMenuBlurBackground: Color =
            color(R.color.sesl_popup_menu_blur_background_dark)
        override val seslPopupMenuItemTextColorNormal: Color =
            color(R.color.sesl_popup_menu_item_text_color_normal_dark)
        override val seslProgressControlColorBackground: Color =
            color(R.color.sesl_progress_control_color_background_dark)
        override val seslProgressDialogHorizontalTextColor: Color =
            color(R.color.sesl_progress_dialog_horizontal_text_color_dark)
        override val seslScrollbarIndexTipColor: Color =
            color(R.color.sesl_scrollbar_index_tip_color_dark)
        override val seslSearchResultSubtitleTextColor: Color =
            color(R.color.sesl_search_result_subtitle_text_color_dark)
        override val seslSearchResultTitleTextColor: Color =
            color(R.color.sesl_search_result_title_text_color_dark)
        override val seslSearchTextfieldColor: Color =
            color(R.color.sesl_search_textfield_color_dark)
        override val seslSearchUrlTextDefault: Color =
            color(R.color.sesl_search_url_text_default_dark)
        override val seslSearchUrlTextPressed: Color =
            color(R.color.sesl_search_url_text_pressed_dark)
        override val seslSearchUrlTextSelected: Color =
            color(R.color.sesl_search_url_text_selected_dark)
        override val seslSearchViewHintTextColor: Color =
            color(R.color.sesl_search_view_hint_text_color_dark)
        override val seslSearchViewIconColor: Color =
            color(R.color.sesl_search_view_icon_color_dark)
        override val seslSearchViewTextColor: Color =
            color(R.color.sesl_search_view_text_color_dark)
        override val seslSeekbarControlColorActivated: Color =
            color(R.color.sesl_seekbar_control_color_activated_dark)
        override val seslSeekbarControlColorDefault: Color =
            color(R.color.sesl_seekbar_control_color_default_dark)
        override val seslSeekbarControlColorSecondary: Color =
            color(R.color.sesl_seekbar_control_color_secondary_dark)
        override val seslShowButtonShapesColorDefault: Color =
            color(R.color.sesl_show_button_shapes_color_default_dark)
        override val seslShowButtonShapesColorDisabled: Color =
            color(R.color.sesl_show_button_shapes_color_disabled_dark)
        override val seslShowButtonShapesStrokeColorDefault: Color =
            color(R.color.sesl_show_button_shapes_stroke_color_default_dark)
        override val seslShowButtonShapesStrokeColorDisabled: Color =
            color(R.color.sesl_show_button_shapes_stroke_color_disabled_dark)
        override val seslSpinnerDropdownItemCheckmark: Color =
            color(R.color.sesl_spinner_dropdown_item_checkmark_dark)
        override val seslSwitchThumbOffColor: Color =
            color(R.color.sesl_switch_thumb_off_color_dark)
        override val seslSwitchThumbOffDisabledColor: Color =
            color(R.color.sesl_switch_thumb_off_disabled_color_dark)
        override val seslSwitchThumbOffDisabledStrokeColor: Color =
            color(R.color.sesl_switch_thumb_off_disabled_stroke_color_dark)
        override val seslSwitchThumbOffStrokeColor: Color =
            color(R.color.sesl_switch_thumb_off_stroke_color_dark)
        override val seslSwitchThumbOnColor: Color = color(R.color.sesl_switch_thumb_on_color_dark)
        override val seslSwitchThumbOnDisabledColor: Color =
            color(R.color.sesl_switch_thumb_on_disabled_color_dark)
        override val seslSwitchTrackOffColor: Color =
            color(R.color.sesl_switch_track_off_color_dark)
        override val seslSwitchTrackOffDisabledColor: Color =
            color(R.color.sesl_switch_track_off_disabled_color_dark)
        override val seslThumbControlColorActivated: Color =
            color(R.color.sesl_thumb_control_color_activated_dark)
        override val seslThumbTintColorDisabled: Color =
            color(R.color.sesl_thumb_tint_color_disabled_dark)
        override val seslAppPickerListActionIconTintColor: Color =
            color(R.color.sesl_app_picker_list_action_icon_tint_color_dark)
        override val notificationTemplateIconBg: Color =
            color(R.color.notification_template_icon_bg_dark)
        override val notificationTemplateIconLowBg: Color =
            color(R.color.notification_template_icon_low_bg_dark)
        override val notificationActionColorFilter: Color =
            color(R.color.notification_action_color_filter_dark)
        override val notificationIconBgColor: Color = color(R.color.notification_icon_bg_color_dark)
        override val seslIndexScrollPreviewTextColor: Color =
            color(R.color.sesl_index_scroll_preview_text_color_dark)
        override val seslNumberPickerTextColor: Color =
            color(R.color.sesl_number_picker_text_color_dark)
        override val seslNumberPickerTextHighlightColor: Color =
            color(R.color.sesl_number_picker_text_highlight_color_dark)
        override val seslDatePickerWeekdayNumberTextColor: Color =
            color(R.color.sesl_date_picker_weekday_number_text_color_dark)
        override val seslColorPickerCursorStrokeColor: Color =
            color(R.color.sesl_color_picker_cursor_stroke_color_dark)
        override val seslColorPickerDivider: Color = color(R.color.sesl_color_picker_divider_dark)
        override val seslColorPickerPercentTextColor: Color =
            color(R.color.sesl_color_picker_percent_text_color_dark)
        override val seslColorPickerSeekbarCursorBackgroundColor: Color =
            color(R.color.sesl_color_picker_seekbar_cursor_background_color_dark)
        override val seslColorPickerSeekbarCursorStrokeColor: Color =
            color(R.color.sesl_color_picker_seekbar_cursor_stroke_color_dark)
        override val seslColorPickerShadow: Color = color(R.color.sesl_color_picker_shadow_dark)
        override val seslColorPickerStrokeColorSpectrumview: Color =
            color(R.color.sesl_color_picker_stroke_color_spectrumview_dark)
        override val seslColorPickerStrokeColorSwatchview: Color =
            color(R.color.sesl_color_picker_stroke_color_swatchview_dark)
        override val seslColorPickerSwatchCursorColor: Color =
            color(R.color.sesl_color_picker_swatch_cursor_color_dark)
        override val seslColorPickerSwatchCursorColorForWhite: Color =
            color(R.color.sesl_color_picker_swatch_cursor_color_for_white_dark)
        override val seslColorPickerTabUnselected: Color =
            color(R.color.sesl_color_picker_tab_unselected_dark)
        override val seslColorPickerTransparent: Color =
            color(R.color.sesl_color_picker_transparent_dark)
        override val preferenceFallbackAccentColor: Color =
            color(R.color.preference_fallback_accent_color_dark)
        override val seslSwipeRefreshColor1: Color = color(R.color.sesl_swipe_refresh_color1_dark)
        override val seslSwipeRefreshColor2: Color = color(R.color.sesl_swipe_refresh_color2_dark)
        override val materialGrey900: Color = color(R.color.material_grey_900_dark)
        override val materialGrey850: Color = color(R.color.material_grey_850_dark)
        override val materialGrey800: Color = color(R.color.material_grey_800_dark)
        override val materialGrey600: Color = color(R.color.material_grey_600_dark)
        override val materialGrey300: Color = color(R.color.material_grey_300_dark)
        override val materialGrey100: Color = color(R.color.material_grey_100_dark)
        override val materialGrey50: Color = color(R.color.material_grey_50_dark)
        override val materialDeepTeal200: Color = color(R.color.material_deep_teal_200_dark)
        override val materialDeepTeal500: Color = color(R.color.material_deep_teal_500_dark)
        override val materialBlueGrey800: Color = color(R.color.material_blue_grey_800_dark)
        override val materialBlueGrey900: Color = color(R.color.material_blue_grey_900_dark)
        override val materialBlueGrey950: Color = color(R.color.material_blue_grey_950_dark)
        override val seslNavigationBarBackground: Color = color(R.color.sesl_navigation_bar_background_dark)
        override val seslNavigationBarIcon: Color = color(R.color.sesl_navigation_bar_icon_dark)
        override val seslNavigationBarRipple: Color = color(R.color.sesl_navigation_bar_ripple_dark)
        override val seslNavigationBarText: Color = color(R.color.sesl_navigation_bar_text_dark)
        override val seslNavigationBarTextDisable: Color = color(R.color.sesl_navigation_bar_text_disable_dark)
        override val seslNavigationBarTextText: Color = color(R.color.sesl_navigation_bar_text_text_dark)
        override val seslTablayoutMainTabIndicatorColor: Color = color(R.color.sesl_tablayout_main_tab_indicator_color_dark)
        override val seslTablayoutSubtabIndicatorBackground: Color = color(R.color.sesl_tablayout_subtab_indicator_background_dark)
        override val seslTablayoutSubtabSubTextColorDefault: Color = color(R.color.sesl_tablayout_subtab_sub_text_color_default_dark)
        override val seslTablayoutSubtabSubTextColorDisabled: Color = color(R.color.sesl_tablayout_subtab_sub_text_color_disabled_dark)
        override val seslTablayoutSubtabSubTextColorSelected: Color = color(R.color.sesl_tablayout_subtab_sub_text_color_selected_dark)
        override val seslTablayoutSubtabTextColorDefault: Color = color(R.color.sesl_tablayout_subtab_text_color_default_dark)
        override val seslTablayoutSubtabTextColorDisabled: Color = color(R.color.sesl_tablayout_subtab_text_color_disabled_dark)
        override val seslTablayoutSubtabTextColorSelected: Color = color(R.color.sesl_tablayout_subtab_text_color_selected_dark)
        override val seslTablayoutTextColorDefault: Color = color(R.color.sesl_tablayout_text_color_default_dark)
        override val seslTablayoutTextColorDisabled: Color = color(R.color.sesl_tablayout_text_color_disabled_dark)
        override val seslTablayoutTextColorSelected: Color = color(R.color.sesl_tablayout_text_color_selected_dark)
        override val seslTablayoutSubtabBackgroundStrokeColor: Color = color(R.color.sesl_tablayout_subtab_background_stroke_color_dark)

        override val seslPreferenceRelativeCardBackground = Color(R.color.sesl_preference_relative_card_background_dark)
        override val ouiTipsCardPreferenceBackground = color(R.color.oui_tipscardpref_bg_color_light)

        /*
        Colors that aren't found in the oui-libs colors.xml file, and therefore 'hardcoded'
         */
        override val drawerScrim = color(R.color.sesl_drawer_scrim_dark)
        override val drawerHeaderIcon = color(R.color.sesl_drawer_header_icon_dark)
        override val drawerItemEndLabel = color(R.color.sesl_drawer_item_end_label_dark)
        override val drawerItemLabel = color(R.color.sesl_drawer_item_label_dark)
        override val drawerItemLabelSelected = color(R.color.sesl_drawer_item_label_selected_dark)
        override val buttonDefaultBackground = color(R.color.sesl_button_default_background_light)
    }